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
public class MyStack{
    //Node instance 
    public SLListNode front;
    
    //Default constructor 
    public MyStack(){
        front = null;
    }
    
    /**
     * Removes element from stack
     * @return 
     */
    public Object pop(){
        if(front==null){
            return null;
        }
        Object temp = front.data;
        front = front.next;
        return temp;
    }
    /**
     * Adds object into stack
     * @param e the element being added
     */
    public void push(Object e){
        front = new SLListNode(e, front);
        
    }
    //Returns first element 
    public Object top(){
        if(front==null){
            return null;
        }
        return front.data;
    }
    //Builds string by iterating through elements and concatenating it to the string called str
    public String toString(){
        String str = "The list contains: [";
        if(front==null){
            return "The list is empty.";
        }
        
        SLListNode ref = front;
        while(ref.next != null){
            str+=ref.data + ", ";
            ref=ref.next;
        }
        str+="]";
        return str;
    }
    
}
