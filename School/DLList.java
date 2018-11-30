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
public class DLList {
    private int size;
    public DLListNode head;
    public DLListNode tail;

    public DLList(){
        this.size=0;
        this.head=null;
        this.tail=null;
    }

    public int getSize()    {return size;}

    public boolean isEmpty()    {return getSize() == 0;}

    public void insert(Object e){
        DLListNode ref = new DLListNode(e, head);
        if(head==null){
            head=ref;
            tail=ref;
        }else{
            ref.next = head;
            head.prev = ref;
            head = ref;
        }
        size++;
    }

    public void add(Object e){
        DLListNode ref = new DLListNode(e, tail);
        if(size==0){
            head = ref;
        }else{
            tail.next = ref;
        }
        tail = ref;
        size++;
    }
    @Override
    public String toString(){
        String str = "The List Contains: ";
        if(size==0){
            str+="No nodes";
            return str;
        }else{
            str+="[";
            DLListNode ref = head;
            while(ref != null){
                str+=ref.data;
                if(ref.next!=null){
                    str+=", ";
                }
                ref = ref.next;
            }
            str+="]";
            return str;

        }
    }

}
