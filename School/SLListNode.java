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
public class SLListNode {
    public SLListNode head;
    public SLListNode next;
    public Object data;

    public SLListNode(Object data, SLListNode next){
        this.data = data;
        this.next = next;
    }
    public SLListNode(Object data){
        this.data = data;
    }
}
