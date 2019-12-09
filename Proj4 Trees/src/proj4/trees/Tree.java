/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj4.trees;

/**
 *
 * @author G00281017
 */
public class Tree<E extends Comparable<E>>
{
    
    private BSTNode<E> root;
    private int numItems;
    
    public Tree() {
        
        root = null;
        numItems = 0;
    }
    
    public void add(E element) {
        
        if (root == null) {
            root = new BSTNode<E>(element, null, null);
            numItems++;
        }
        else {
            BSTNode<E> cursor = root;
            boolean done = false;
            
            while(!done) {
                if (element.compareTo(cursor.getData()) <= 0) {
                    if(cursor.getLeft() == null) {
                        cursor.setLeft(new BSTNode<E>(element, null, null));
                        done = true;
                        numItems++;
                    }
                    else
                        cursor = cursor.getLeft();
                }
                else {
                    if(cursor.getRight() == null) {
                        cursor.setRight(new BSTNode<E>(element, null, null));
                        done = true;
                        numItems++;
                    }
                    else
                        cursor = cursor.getRight();
                }
            }
        }
    }
    
    public int size() {
        
        return numItems;
    }
    
    public void printTree() {
        
        if (root != null)
            root.inOrderPrint();
    }
    
    public boolean remove(E element) {
        
        boolean found = false;
        BSTNode<E> cursor = root,
                parentOfCursor = null;
        
        while(cursor != null && !found) {
            if(cursor.getData().equals(element)) {
                found = true;
                cursor.setData(null);
                System.out.println("Found it!");
            }
            else {
                parentOfCursor = cursor;
                System.out.println("Testing Cursor");
                if(element.compareTo(cursor.getData()) <= 0) 
                    cursor = cursor.getLeft();
                else
                    cursor = cursor.getRight();
                
            }
        }
        if (cursor == null) {
            System.out.println("In here but shouldn't be!");
            found = false; 
        }
        
        else if(cursor == root && cursor.getLeft() == null) {
            root = root.getRight();
            numItems--;
        }
        else if (cursor != root && cursor.getLeft() == null) {
            if (cursor == parentOfCursor.getLeft()) {
                parentOfCursor.setLeft(cursor.getRight());
            }
            else {
                parentOfCursor.setRight(cursor.getRight());
            }  
        }
        else {
            cursor.setData(cursor.getLeft().getRightMostData());
            cursor.setLeft(cursor.getLeft().removeRightMost());
        }       
        return found;
        
    }
    
    public boolean exists(E element) {
        
        boolean found = false;
        BSTNode<E> cursor = root,
                parentOfCursor = null;
        
        while(cursor != null && !found) {
            if(cursor.getData().equals(element)) {
                found = true;
            }
            else {
                parentOfCursor = cursor;
                if(element.compareTo(cursor.getData()) <= 0) 
                    cursor = cursor.getLeft();
                else
                    cursor = cursor.getRight();
                
            }
        }
        if (cursor == null)
            found = false;
        
        return found;
    }
    
}
