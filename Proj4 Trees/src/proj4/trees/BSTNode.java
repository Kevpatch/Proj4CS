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
public class BSTNode<E> {
        
        private E data;
        private BSTNode<E> left;
        private BSTNode<E> right;
    
    public BSTNode(E newData, BSTNode<E> newLeft, BSTNode<E> newRight) {
        
        data = newData;
        left = newLeft;
        right = newRight;
    }
    
    public E getData() {
        
        return data;
    }
    
    public BSTNode<E> getLeft() {
        
        return left;
    }
    
    public BSTNode<E> getRight() {
        
        return right;
    }
    
    public void inOrderPrint() {
        
        if (left != null) {
            System.out.println("testing Left");
            left.inOrderPrint();
        }
        
        System.out.println(data);
        
        if (right != null) {
            System.out.println("testing Right");
            right.inOrderPrint();
        }
    }
    
    public void setData(E newData) {
        
        data = newData;
    }
    
    public void setLeft(BSTNode<E> newLeft) {
        
        left = newLeft;
    }
    
    public void setRight(BSTNode<E> newRight) {
        
        right = newRight;
    }
    
    public E getRightMostData() {
        
        if(left == null)
            return data;
        else
            return left.getRightMostData();
    }
    
    public BSTNode<E> removeRightMost() {
        
        if (right == null)
            return left;
        else {
            right = right.removeRightMost();
            return right;
        }
    }
}
