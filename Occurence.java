/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apple
 */
public class Occurence {
    
    private int num;
    private int occurence;
    
    public Occurence(int a,int b)
    {
        num=a;
        occurence=b;
    }
    public int getNumber() {
        
        return num;
    }
    public int getOccurence() {
        return occurence;
    }
    public void setNumber(int a)
    {
        num=a;
    }
    public void setOccurence(int a) {
        
        occurence=a;
    }
    
    public String toString()
    {
        return "Number "+num+" occurs "+occurence+" times \n";
    }
}
