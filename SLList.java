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
public class SLList {
    private SLListNode head;
    private SLListNode tail;
    private int size;
    //Constructor
    public SLList(){
        head = tail = null;
        size = 0;
    }

    /**
     * Appends element at back of list
     * @param e element appended
     */
    public void append(Object e){
        if(head==null){
            head = tail = new SLListNode(e, null);
            size++;
        }
        tail = tail.next = new SLListNode(e, null);

    }

    /**
     * Inserts object at front of list
     * @param e element appended
     */
    public void insert(Object e){
        if(head==null){
            head = tail = new SLListNode(e, null);
            size++;
        }else{
            head = new SLListNode(e, head);
            size++;
        }
    }

    /**
     * Clears list
     */
    public void clear(){
        head = tail = null;
        size=0;
    }

    /**
     * Checks if list is empty
     * @return boolean value evaluating whether it is empty or not
     */
    public boolean isEmpty(){
        if(size==0) {return true;}
        else {return false;}
    }

    /**
     * Removes object from list
     * @param e object wanting to be removed
     * @return
     */
    public boolean remove(Object e){
        if(head==null) {return false;}
        SLListNode ref = head;
        while(ref.next != tail) {
            if (((Comparable) (ref.next.data)).compareTo(e) == 0) {
                ref.next = ref.next.next;
            }
            ref = ref.next;
        }
        return false;
    }

    /**
     * Returns size
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * Prints out elements of list
     * @return
     */
    public String toString() {
        String empty = "The Single Linked List contains: ";
        String notE = "The Single Linked List contains: [";
        if (head == null) {
            return empty + "0 nodes";
        }
        SLListNode ref = head;
        while (true) {
            notE += ref.data + ", ";
            ref = ref.next;

            if(ref == tail){
                break;
            }
        }
        notE += ref.data + "]";
        return notE;
    }
}
