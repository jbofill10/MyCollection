/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Vector;
import collection.MyVector;
/**
 *
 * @author juanb
 */
public class Lab2 {
    public static void test() {
        MyVector v = new MyVector();
        int firstNum = 1;
        int lastNum = 0;
        int temp = 0;
        //fibonacci sequence
        for(int i=0;i<25;i++){
            v.append(temp);
            temp=firstNum;
            firstNum+=lastNum;
            lastNum=temp;
        }
        //Prints vector
        System.out.println(v);
        //Reverses vector
        v.reverse();
        //Prints reversed vector
        System.out.println(v);
        //Clones vector
        MyVector clone = v.clone();
        //Removes odd indexes from original vector
        for(int i=1;i<v.size();i++){
            v.removeAt(i);
        }
        //Prints original vector with no odd indexes
        System.out.println(v);
        //Reverses cloned vector
        clone.reverse();
        //Prints reversed vector clone
        System.out.println(clone);
        //Merges original vector w clone vector
        v.merge(clone);
        //Prints the merged vector 
        System.out.println(v);
        }
        
    }
