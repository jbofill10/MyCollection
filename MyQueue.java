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
public class MyQueue {
    //Node instances
    public SLListNode front;
    public SLListNode rear;
    
    //Default constructor
    public MyQueue(){
        front = rear = null;
    }
    
    //Clears queue
    public void clear(){
        front = rear = null;
    }
    
    //Checks if queue is empty
    public boolean isEmpty(){
        return front == null;
    }
    
    /**
     * Adds element into queue
     * @param e Element being added
     */
    public void insertBack(Object e){
        if(front==null){
            front = rear = new SLListNode(e, null);
            return;
        }
        rear = rear.next = new SLListNode(e, null);
    }
    
    /**
     * Removes the element from queue
     * @return Element being added
     */
    public Object removeFront(){
        if(front==null){
            return null;
        }
        Object temp = front.data;
        if(front==rear){
            front = rear = null;
        }else{
            front = front.next;
        }
        return temp;
    }
    
    /**
     * Returns first element
     * @return 
     */
    public Object front(){
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
