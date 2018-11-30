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
public class Dequeue extends DLList{
    public void add(Object e)   {super.add(e);}

    public void insert(Object e)    {super.insert(e);}

    public boolean isEmpty()    {return super.isEmpty();}

    public int getSize()    {return super.getSize();}

    public Object removeFirst() {
        DLListNode ref = head;
        if (head.next == null){
            tail = null;
        }else{
            head.next.prev = null;
            head = head.next;
        }
        return ref.data;
    }

    public Object removeLast(){
        DLListNode ref = tail;
        if(head.next==null){
            head=null;
        }else{
            tail.prev.next=null;
            tail=tail.prev;
        }
        return ref.data;
    }
}
