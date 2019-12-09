/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj4.trees;

import java.util.Scanner;

/**
 *
 * @author G00281017
 */
public class Driver {
   
        public static void main(String[] args) {
               
        String input;
        int consumed;
        String flavor;
        Tree<Soda> newSodaTree = new Tree<Soda>();
        Soda userSoda = new Soda();
        Scanner keyboard = new Scanner(System.in);
        
        do {
            
            System.out.print("\n Soda Node Bag");
            System.out.println("\n Menu:");
            System.out.println("\nA - Add ");
            System.out.println("R - Remove");
            System.out.println("F - Find");
            System.out.println("D - Display");
            System.out.println("X - Exit Menu");
            
            
            System.out.println("Your Choice is (Single Character Only): ");
            input = keyboard.nextLine();
            
            if (input.equalsIgnoreCase("X")) {
                
                System.out.println("You will be removed from the menu");
                System.out.println("Goodbye");
            }
            
            else if (input.equalsIgnoreCase("A")) {
                
                System.out.println("What flavor is your favorite Soda?");
                flavor = keyboard.nextLine();
                
                System.out.println("How many did you drink?");
                consumed = keyboard.nextInt();
                System.out.println("Really? That many?");
                
                userSoda = new Soda();
                userSoda.setFlavor(flavor);
                userSoda.setConsumed(consumed);
                
                newSodaTree.add(userSoda);
            }
            
            else if (input.equalsIgnoreCase("R")) {
                
                if (newSodaTree.size() == 0) {
                    System.out.println("Tree is Emtpy");
                }
                else {
                    System.out.println("What Flavor was the Soda?");
                    flavor = keyboard.nextLine();
                
                    System.out.println("How many did they drink?");
                    consumed = keyboard.nextInt();
                    
                    
                    userSoda.setFlavor(flavor);
                    userSoda.setConsumed(consumed);
                
                    newSodaTree.remove(userSoda);
                
                    if (newSodaTree.remove(userSoda) == true) 
                        System.out.println("Soda was removed");
                    else
                        System.out.println("Soda was not there");
                }
                
            }
            else if (input.equalsIgnoreCase("F")) {
                
                if (newSodaTree.size() == 0)
                    System.out.println("Tree is Empty");
                else {
                System.out.println("What Flavor was the Soda?");
                flavor = keyboard.nextLine();
                
                System.out.println("How many did they drink?");
                consumed = keyboard.nextInt();
                
                userSoda.setFlavor(flavor);
                userSoda.setConsumed(consumed);
                
                newSodaTree.exists(userSoda);
                
                if (newSodaTree.exists(userSoda) != false) 
                    System.out.println("Soda is found");
                else
                    System.out.println("Soda was not there");
                }
            }
            else if (input.equalsIgnoreCase("D")) {
                if (newSodaTree.size() == 0)
                    System.out.println("Tree is Empty");
                
                else {
                newSodaTree.printTree();
                System.out.println("The Tree is " + newSodaTree.size());
                }
        }
            else {
                System.out.println("Please Select One of the Commands");
            }
                
        } while (!(input.equalsIgnoreCase("X")));
        
        }
}
                

        
    
    

