/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Arrays;

/**
 *
 * @author juanb
 */
public class MySort {
    /**
     * Performs bubblesort to order the vector
     * @param vec The vector being sorted
     */
    public static void bubbleSort(MyVector vec){
        for(int i = 0; i<vec.size-1;i++){
            for(int j = 0; j<vec.size-1;j++){
                if((int)vec.elementAt(j+1) < (int)vec.elementAt(j)){
                    Object temp = vec.elementAt(j);
                    vec.replace(j, vec.elementAt(j+1));
                    vec.replace(j+1, temp);
                
                }   
            }
        }
    }
   /**
    * Uses selectionSort to order the vector
    * @param vec The vector being ordered 
    */
public static void selectionSort(MyVector vec) {
    for (int i = 0; i < vec.size() - 1; i++) {
        int minIndex = i;
        Object min = vec.elementAt(minIndex);

        for (int j = i + 1; j < vec.size(); j++) {
            Object temp = vec.elementAt(j);
            if (((Comparable<Object>) temp).compareTo(min) < 0) {
                minIndex = j;
                min = temp;
            }
        }
        vec.replace(minIndex, vec.elementAt(i));
        vec.replace(i, min);
    }
}
    /**
     * The recursive method created to split the array in halves to be sorted.
     * @param vect The vector being passed through from the test method with 30,000 different numbers
     */
    public static void mergeSort(Object[] vect) {
        if (vect.length > 1) {
            //Splits them in half
            Object[] left = Arrays.copyOfRange(vect, 0 , vect.length / 2);
            Object[] right = Arrays.copyOfRange(vect, vect.length / 2, vect.length);
            //Sorts them
            mergeSort(left);
            mergeSort(right);
            //Actually merges the sorted halves
            merge(vect,left,right);
        }

    }
    /**
     * This is where the sorted halves come together 
     * @param vect the "final" vector or what the halves merge into
     * @param left the left half
     * @param right the right half
     */
    public static void merge(Object[] vect, Object[] left, Object[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        
        for (int i = 0; i < vect.length; i++) {
            if (rightIndex >= right.length || (leftIndex < left.length && compare(left[leftIndex], right[rightIndex]) <= 0)){
                vect[i] = left[leftIndex];    
                leftIndex++;
            }else{
                vect[i] = right[rightIndex];
                rightIndex++;    
            }
        }

    }
    /**
     * just a method created to reduce the amount of times I have to type a wrapper class to compare to object elements.
     * @param target the object comparing
     * @param otherThing the object being compared to
     * @return returns the number value in order to make the clause true.
     */
     private static int compare(Object target, Object otherThing) {
        return ((Comparable<Object>)target).compareTo(otherThing);
    }
     /**
      * Sorts the array with the quicksort algorithm, while being recursive
      * @param vect the array being passed through
      * @param low the lowest index     
      * @param high the highest index  
      */
     public static void quickSort(Object[] vect, int low, int high){
         int l = low, h = high;
         int middle=0;
         Object piv = 0;
         if(low>=high){
             return;
         }
         middle = low+(high-low)/2;
         piv = vect[middle];
         
         
         while(l<=h){
            while((int)vect[l] < (int)piv){
                l++;
            }
            while((int)vect[h]>(int)piv){
                h--;
            }
            if(l<=h){
                Object temp = vect[l];
                vect[l] = vect[h];
                vect[h] = temp;
                l++;
                h--;
            }
         }   
         if(low<h){
             quickSort(vect,low,h);
         }
         if(high>l){
             quickSort(vect,l,high);
         }
     }
     /**
      * Sorts the array with the shell sort algorithm 
      * @param vect The array being sorted
      */
     public static void shellSort(Object[] vect){
         int skip = vect.length/2;
         while (skip>0){
             for(int i = skip;i<vect.length;i++){
                 int j = i;
                 Object temp = vect[i];
                 while(j>=skip && (int)vect[j-skip]>(int)temp){
                     vect[j]=vect[j-skip];
                     j=j-skip;
                 }
                 vect[j]=temp;
             }
             if(skip==2){
                 skip=1;
             }else{
                 skip*=(5.0/11);
             }
         }
    }

     /**
      * Sorts the array with insertion sort
      * @param vect the array being passed through
      * @param length the length of the array
      */
     public static void insertionSort(Object[] vect, int length){
         for(int i=1;i<length;i++){
             Object temp = vect[i];
             int j = i-1;
             
             while(j>=0 && (int)vect[j]>(int)temp){
                 vect[j+1]=vect[j];
                 j-=1;
             }
             vect[j+1]=temp;
         }
         
     }
}
