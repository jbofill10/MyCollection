/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.SLList;
import collection.SortedSLList;

/**
 *
 * @author juanb
 */
public class Lab6 {
	/**
	* Test method to feed values into list
	*/
    public static void test(){
    	SLList s = new SLList();
        SortedSLList se = new SortedSLList();
        for(int i = 1; i<=30;i++){
            if(i%2==0) {
                s.append((int) Math.pow(i, 2));
            }else{
                s.insert((int) Math.pow(i, 2));
            }
        }
        System.out.println(s);
        s.remove(25);
        s.remove(36);
        s.remove(64);
        s.remove(100);
        s.remove(400);
        System.out.println(s);

        for(int i = 1; i<=30;i++){
            se.insert((int)Math.pow(i,2));
        }
        System.out.println(se);
        

        
    }
}

