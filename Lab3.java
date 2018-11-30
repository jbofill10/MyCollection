/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.MySearch;
import collection.MySort;
import collection.MyVector;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juanb
 */
public class Lab3 {
    public static void test(){
        Scanner input = new Scanner(System.in);
        MyVector numVec = new MyVector();
        Random rand = new Random(System.nanoTime());
        //Generates numbers 100-999
        for(int i = 0; i<900;i++){
            Integer annoying = Integer.valueOf(rand.nextInt(899)+101);
            Object annoying2 = annoying;
            numVec.append(annoying2);
        }
        //Bubble sort
        MySort.bubbleSort(numVec);
        System.out.println(numVec);
        //Prompts user for a number to search for
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        //Uses the number given by user to search it 
        System.out.println(MySearch.LinearSearchSorted(numVec, num));
        //Removes the range of numbers from index 50,550
        numVec.removeRange(50, 550);
        System.out.println(numVec);
        //Reverses it
        numVec.reverse();
        //Orders it through selection sort
        MySort.selectionSort(numVec);
        System.out.println(numVec);
        //Prompts user for num to search for
        System.out.println("Enter a number: ");
        num = input.nextInt();
        //Searches for num given by user in binary search.
        System.out.println(MySearch.binarySearch(numVec, num));    
        
    }
}
