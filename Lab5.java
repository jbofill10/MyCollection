/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.MySort;
import java.util.Random;
import collection.MyVector;
import java.util.Arrays;

/**
 *
 * @author juanb
 */
public class Lab5 {
    public static void Test(){
        MyVector vect = new MyVector();
        MyVector fillerVect = new MyVector();
        Object[] array = new Object[30000];
        Object[] filler = new Object[30000];
        Random rand = new Random(); 
        rand.setSeed(20181010);
       //Where the 30,000 integers are genereated randomly 
        for(int i = 0;i < 30000; i++){
            filler[i] = rand.nextInt(99999)+1;
            fillerVect.append(i);
        }
        array=filler.clone();
        long before = System.currentTimeMillis();
        MySort.mergeSort(array);
        long after = System.currentTimeMillis()-before;
        
        System.out.println("MERGE SORT:");
        System.out.println("The time it took to sort the array: " + after + "ms");
        System.out.println("Index[0]: " +array[0]+ ".\nIndex[1]: " +array[1]+ ".\nIndex[2]: " +array[2]+ ".\nIndex[9999]: " +array[9999]+ ".\nIndex[19999]: " +array[19999] + ".\nIndex[29999]: " +array[29999]);
        array=filler.clone();
        
        System.out.println("QUICK SORT:");
        before = System.currentTimeMillis();
        MySort.quickSort(array, 0, array.length-1);
        after = System.currentTimeMillis()-before;
        System.out.println("The time it took to sort the array: " + after + "ms");
        System.out.println("Index[0]: " +array[0]+ ".\nIndex[1]: " +array[1]+ ".\nIndex[2]: " +array[2]+ ".\nIndex[9999]: " +array[9999]+ ".\nIndex[19999]: " +array[19999] + ".\nIndex[29999]: " +array[29999]);
        array=filler.clone();
        
        System.out.println("SHELL SORT:");
        before = System.currentTimeMillis();
        MySort.shellSort(array);
        after = System.currentTimeMillis()-before;
        System.out.println("The time it took to sort the array: " + after + "ms");
        System.out.println("Index[0]: " +array[0]+ ".\nIndex[1]: " +array[1]+ ".\nIndex[2]: " +array[2]+ ".\nIndex[9999]: " +array[9999]+ ".\nIndex[19999]: " +array[19999] + ".\nIndex[29999]: " +array[29999]);
        array=filler.clone();
        
        System.out.println("INSERTION SORT:");
        before = System.currentTimeMillis();
        MySort.insertionSort(array, array.length);
        after = System.currentTimeMillis()-before;
        System.out.println("The time it took to sort the array: " + after + "ms");
        System.out.println("Index[0]: " +array[0]+ ".\nIndex[1]: " +array[1]+ ".\nIndex[2]: " +array[2]+ ".\nIndex[9999]: " +array[9999]+ ".\nIndex[19999]: " +array[19999] + ".\nIndex[29999]: " +array[29999]);
        
        vect = fillerVect.clone();
        System.out.println("BUBBLE SORT:");
        before = System.currentTimeMillis();
        MySort.bubbleSort(vect);
        after = System.currentTimeMillis()-before;
        System.out.println("The time it took to sort the array: " + after + "ms");
        System.out.println("Index[0]: " +array[0]+ ".\nIndex[1]: " +array[1]+ ".\nIndex[2]: " +array[2]+ ".\nIndex[9999]: " +array[9999]+ ".\nIndex[19999]: " +array[19999] + ".\nIndex[29999]: " +array[29999]);
        vect=fillerVect.clone();

        System.out.println("SELECTION SORT:");
        before = System.currentTimeMillis();
        MySort.selectionSort(vect);
        after = System.currentTimeMillis()-before;
        System.out.println("The time it took to sort the array: " + after + "ms");
        System.out.println("Index[0]: " +array[0]+ ".\nIndex[1]: " +array[1]+ ".\nIndex[2]: " +array[2]+ ".\nIndex[9999]: " +array[9999]+ ".\nIndex[19999]: " +array[19999] + ".\nIndex[29999]: " +array[29999]);
        vect=fillerVect;

    }   

}

