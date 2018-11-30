/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author juanb
 */
public class MySearch {
    /**
     * Uses a binary sear`ch algorithm to find the target 
     * @param vec The vector of numbers
     * @param target the number the binary search is looking for
     * @return the index of the target num
     */
    public static Object binarySearch(MyVector vec, Comparable target){        
        int min=0, max=vec.size(), mid=0;
        while (min<=max) {
            int length = max-min;
            mid = length/2+min;
            int val = target.compareTo(vec.elementAt(mid));
            if (val == 0) {
                return mid;        
            } else if (val > 0) {
                min = mid;    
            } else if (val < 0) {
                max = mid;        
            }    
        }
        return -1;
    }
    /**
     * Preforms a linear search for a number
     * @param vec The vector containing numbers
     * @param target the number being searched for
     * @return the index of target num
     */
    public static Object LinearSearchSorted(MyVector vec, Comparable target){
        MyVector v = new MyVector();
        for(int i = 0; i<vec.size;i++){
            int num = target.compareTo(vec.elementAt(i));
            
            if(num==0){
                return i;
            }
            if(num<0){
                return -1;
            }
        }
        return -1;
    }
}
