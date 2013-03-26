import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.SortedSet;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apple
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] a= {5,2,3,4,5,6,7,8,9,10,4,5,6,3,8,9};
        
        Occurence o1= new Occurence(1,2);
        Occurence test1=findOccurence1(a,5);
       System.out.println(test1.toString());
       findOccurence(a);
    }
    
    public static void findOccurence(int[] a)
    {
        HashMap<Integer,Occurence> hm1= new HashMap<Integer,Occurence>();
        HashSet<Integer> h1= new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            h1.add(a[i]);
        }
        Iterator iter = h1.iterator();
        while (iter.hasNext()) 
        {
            int num=(Integer) iter.next();
            Occurence current=findOccurence1(a,num);
            hm1.put(current.getOccurence(), current);
        }
        TreeSet<Integer> occurences = new TreeSet<Integer>(hm1.keySet());
        Iterator iterator;
        iterator = occurences.descendingIterator();
     
        while (iterator.hasNext()) 
        {
            Occurence curr=hm1.get((Integer) iterator.next());
            System.out.println("Integer "+curr.getNumber()+" appears "+curr.getOccurence()+" times");   
        }
      
    }
    public static Occurence findOccurence1(int[] a,int num)
    {
                 
            int number=num;
            int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==number)
                count++;  
            }
        
        return new Occurence(number,count);
        
        }
        
        
    }
    
