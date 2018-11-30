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
public class SortedSLList extends SLList {
    private SLListNode head;
    private SLListNode tail;
    private int size;

    /**
     * Constructor
     */
    public SortedSLList(){
        head = tail = null;
        size = 0;
    }

    /**
     * Call to super class to append
     * @param e element appended
     */
    public void append(Object e){
        super.append(e);
    }

    /**
     * Call to super class to remove
     * @param e object wanting to be removed
     * @return
     */
    @Override
    public boolean remove(Object e){
        if(head==null) {return false;}
        SLListNode ref = head;
        while(ref.next != tail) {
            if (((Comparable)(ref.next.data)).compareTo(e) == 0) {
                ref.next = ref.next.next;
            }
            ref = ref.next;
        }
        return false;
    }

    /**
     * Gets size
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * Checks if empty
     * @return
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }

    /**
     * Inserts object and sorts it accordingly
     * @param e element appended
     */
    public void insert(Object e) {
        if (size == 0) {
            head = tail = new SLListNode(e);
            size = 1;
            return;
        }
        if (((Comparable)(e)).compareTo(head.data) < 0) {
            head = new SLListNode(e, head);
            size++;
            return;
        }
        SLListNode ref = head;
        while (ref.next != null && ((Comparable)(e)).compareTo(ref.next.data) > 0) {
            ref = ref.next;
        }
        ref.next = new SLListNode(e, ref.next);
        size++;
    }

    /***
     * Prints out elements
     * @return
     */
    public String toString() {
        String s = "The Single Linked List contains: [";
        SLListNode node = head;

        while (node != null) {
            s += node.data.toString();
            if (node.next != null)
                s += ", ";
            node = node.next;
        }

        return s + "]";
    }
}