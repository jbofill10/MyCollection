/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author juanb
 */

/**
 * This block of code appears to create a new vector, add different elements of different types and then output statements of information regarding the elements of the vector
 * Then an element is removed from the vector and more output statements are put to give information about the changed vector
 */
public class Lab1 {
    /**
     * 
     * @param args Passes through args which are stored in the runtime 
     * configuration profile through the main method 
     */
    public static void test(String[] args){
        Vector<Object> vector = new Vector<Object>(); 
        int primitiveInt = 241; 
        Integer wrapperInt = new Integer(2018); 
        String str = "Juan Bofill"; 
        vector.add(primitiveInt); 
        vector.add(wrapperInt); 
        vector.add(str);
        vector.add(2, new Integer(2188)); 

        System.out.println("The elements of vector: " + vector);
        System.out.println("The size of vector is: "  + vector.size());
        System.out.println("The elements at position 2 is: "  + vector.elementAt(2));
        System.out.println("The first element of vector is: "  + vector.firstElement());
        System.out.println("The last element of vector is: "  + vector.lastElement());
        
        vector.removeElementAt(1);
        
        System.out.println("The elements of vector: " + vector);
        System.out.println("The size of vector is: "  + vector.size());
        System.out.println("The elements at position 2 is: "  + vector.elementAt(2));
        System.out.println("The first element of vector is: "  + vector.firstElement());
        System.out.println("The last element of vector is: "  + vector.lastElement());
        
        //Clearing vector
        vector.clear();       
         
        //Adds args into the vector
        for(String arg: args){
            vector.addElement(Integer.parseInt(arg));
        }
        System.out.println("The elements of the vector: "+vector);
        //removes odd indices 
        for(int i = 1; i<vector.size();i++)
            {vector.removeElementAt(i);}
        
        System.out.println("The elements of the vector: "+vector);
    }
}
