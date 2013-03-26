import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.SortedSet;

public class Main {

    
    public static void main(String[] args) {
        
        int[] a= {5,2,3,4,5,6,7,8,9,10,4,5,6,3,8,9};
        
       findOccurence(a);
    }
    
    public static void findOccurence(int[] a)
    {
        HashMap<Integer,Occurence> hm1= new HashMap<Integer,Occurence>();
        HashSet<Integer> h1= new HashSet<Integer>();
        //elminiate duplicate elements from the array so we only have to search for one instance of the element
        for(int i=0;i<a.length;i++)
        {
            h1.add(a[i]);
        }

        //loop over each instance and find its number of occurences on the original array
        Iterator iter = h1.iterator();
        while (iter.hasNext()) 
        {
            int num=(Integer) iter.next();
            Occurence current=findOccurence1(a,num);
            //insert it into a HashMap with key the number of occunerences
            hm1.put(current.getOccurence(), current);
        }
        //put keys in ascending order in a TreeSet
        TreeSet<Integer> occurences = new TreeSet<Integer>(hm1.keySet());
        Iterator iterator;
        //traverse the TreeSet in a desceding order
        iterator = occurences.descendingIterator();
     
        while (iterator.hasNext()) 
        {
            Occurence curr=hm1.get((Integer) iterator.next());
            System.out.println("Integer "+curr.getNumber()+" appears "+curr.getOccurence()+" times");   
        }
      
    }
    public static Occurence findOccurence1(int[] a,int num)
    {
        //find occurences for a specific number in the array
                 
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
    
