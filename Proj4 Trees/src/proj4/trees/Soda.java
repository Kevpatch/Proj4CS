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
public class Soda implements Comparable<Soda>
{
    private String flavor;
    private int consumed;
    
    public Soda() {
        
        flavor = "cherry";
        consumed = 1;
    }
    
    public String getFlavor() {
        
        return flavor;
    }
    
    public int getConsumed() {
        
        return consumed;
    }
    
    public void setFlavor(String newFlavor) {
        
        flavor = newFlavor;
    }
    
    public void setConsumed(int drank) {
        
        consumed = drank;
    }
    
    public boolean equals(String testFlavor, int testConsumed) {
        
        boolean equals = false;
        
        if(flavor.equalsIgnoreCase(testFlavor) && testConsumed == consumed)
            equals = true;
        return equals;
    }
    
    public int compareTo(Soda anotherSoda)
    throws ClassCastException
    {
        if(!(anotherSoda instanceof Soda))
            throw new ClassCastException("A Soda object Expected");
        if (getConsumed() < anotherSoda.getConsumed())
            return -1;
        else if (getConsumed() > anotherSoda.getConsumed())
            return 1;
        else
            return flavor.compareToIgnoreCase(anotherSoda.getFlavor());
       
        
    }
    
    public String toString() {
        
        return "[The Soda " + flavor + " has been consumed " + consumed + 
                " times]";
    }
    
}
