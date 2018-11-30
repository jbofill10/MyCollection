/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.MyQueue;
import collection.MyStack;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

/**
 *
 * @author juanb
 */
public class Lab7 {
    public static void test(){
        //Creating instances of stack and queue
        MyQueue queue = new MyQueue();
        MyStack stack = new MyStack();
        Random rand = new Random(); 
        rand.setSeed(System.currentTimeMillis());
        //Adding the random numbers into both data structures
        for(int i = 0; i < 60 ;i++){
            stack.push(rand.nextInt());
            queue.insertBack(rand.nextInt());
        }
        //Popping 30 elements and removing from the front
        for(int i = 0; i < 30 ;i++){
            stack.pop();
            queue.removeFront();
        }
        //Printing to txt file
        try{
            PrintStream out = new PrintStream(new FileOutputStream("COSC241_L7_Output_jabofill0.txt"));

            out.println(stack);
            out.println(queue);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        }

        
    }
    
}
