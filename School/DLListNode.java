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
public class DLListNode {

    public Object data;
    public DLListNode prev;
    public DLListNode next;

    /**
     * DLListNode constructor
     * @param data data for this node
     */
    public DLListNode(Object data) {
        this.data = data;
    }

    /**
     * DLListNode contructor with reference to the prev node
     * @param data data for this node
     * @param prev reference to previous node
     */
    public DLListNode(Object data, DLListNode prev) {
        this.data = data;
        this.prev = prev;
    }

    /**
     * DLListNode constructor with reference to prev and next node
     * @param data data for this node
     * @param prev reference to previous node
     * @param next reference to next node
     */
    public DLListNode(Object data, DLListNode prev, DLListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

}
