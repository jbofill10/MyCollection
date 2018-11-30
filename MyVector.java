/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Arrays;

/**
 *
 * @author juanb
 */
public class MyVector implements Cloneable {
    protected int size;
    protected Object[] vector;
    private static final int INITIAL_CAPACITY = 10;
    /**
     * MyVector constructor
     */
    public MyVector(){
        vector = new Object[INITIAL_CAPACITY];
        size = 0;
    }
    
    /**
     * Appends the elements that are given from the input of the Lab2 class
     * @param element is the element being appended
     */
    public void append(Object element){
        if(size == vector.length){
            expand();
        }
        vector[size++] = element;
    }
    /**
     * Expands the array by double the size to avoid out of bounds exception
     */
    private void expand(){
            Object old[] = vector;
            vector = new Object[old.length*2];
            for(int i=0;i<old.length;i++){
                vector[i]=old[i];
            }

    }
    /**
     * Clears the array and sets the size to 0
     */
    public void clear(){
        Arrays.fill(vector, null);
        size = 0;
    }
    /**
     * Checks if the vector contains an element
     * @param element the element being checked to see if it is in the vector
     * @return the boolean whether it is in the vector or not
     */
    public boolean contains(Object element){
        return indexOf(element) !=-1;
    }
    /**
     * Checks to see what index the element is at
     * @param index being used to check what element is at that index
     * @return the element is returned
     */
    public Object elementAt(int index){
        if(index<0||index>size){
            return null;
        }
        return vector[index];
    }
    /**
     * Looks for the index of the element
     * @param element the element which is being used to find its index
     * @return returns the element or -1 if it is not found
     */
    public int indexOf(Object element){
        for(int i = 0; i<size();i++){
            if(vector[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    /**
     * Inserts an element in the vector while keeping the original elements
     * @param index the index the element is going to be placed in
     * @param element the element that is being inserted
     * @return a boolean that it was inserted
     */
    public boolean insertAt(int index, Object element) {
        if (index < 0 || index > size){
            return false;
        }
	if (index == size) {
            append(element);
            return true;
	}
	if (size == vector.length){
            expand();
        }
	for (int i = size; i > index; i--){
            vector[i] = vector[i-1];
        }
        vector[index] = element;
        size++;

	return true;
	}

    /**
     * Checks to see if it was empty
     * @return boolean of either true of false if the vector is empty
     */
    public boolean isEmpty(){
        return size == 0;
    }
    /**
     * Removes an element at a certain index and accounts for moving the other elements to fill the gap of where the removed element was
     * @param index which index to remove the element at
     * @return returns the removed element 
     */
    public Object removeAt(int index){
        if (index<0||index>=size){
            return null;
        }

	Object element = vector[index];
        
        for (int i=index; i<size-1;i++){
            vector[i]=vector[i+1];
        }
	size--;
	vector[size]=null;

	return element;
    }
    /**
     * Returns a boolean value of whether the element was removed or not
     * @param element
     * @return 
     */
    public boolean remove(Object element){
        return removeAt(indexOf(element))!=null;
    }
    /**
     * Replaces an element in the vector 
     * @param index at which index to replace
     * @param element what element to replace with 
     */
    public void replace(int index, Object element){
        if(index<0||index>=size);
        vector[index]=element; 
    }
    /**
     * 
     * @return the size of the vector
     */
    public int size(){
        return size;
    }
    /**
     * Ensures the capacity for the vector
     * @param minCapacity the minimum capacity the vector requires
     */
    public void ensureCapacity(int minCapacity){
        if (vector.length-size>=minCapacity){
            return;
        }
        Object[] tempArr = new Object[size+minCapacity];

        for (int i =0;i<vector.length;i++){
            tempArr[i] = vector[i];
        }
        vector=tempArr;
    }
    /**
     * Clones the vector
     * @return returns the clone
     */
    public MyVector clone(){        
        MyVector clone = new MyVector();
        clone.ensureCapacity(size);
	for(int i=0;i<size;i++){
            clone.vector[i]=vector[i];
        }
	clone.size=size;
	return clone;
    }
    /**
     * Removes the elements in a determined range among indexes 
     * @param fromIndex the starting point to remove 
     * @param toIndex the ending point to remove
     */
    public void removeRange(int fromIndex, int toIndex){
        if (fromIndex>=toIndex){
            return;
        }
        if (fromIndex<0){
            fromIndex=0;
        }
        if (toIndex>=size){
            toIndex=size;
        }
        int distance=toIndex-fromIndex;
        for (int i=fromIndex;i<toIndex;i++){
            vector[i] = vector[i+distance];
        }
        
        for (int i = toIndex; i < size; i++){
            vector[i] = null;
        }
        size-=distance;

    }
    /**
     * Formats the output of the vector 
     * @return 
     */
    @Override
    public String toString() {
        String str = "The vector size:" + size + ". The vector contents: [";
            if (size==0){
		return str + "]";
            }
            for (int i = 0; i < size; i++){
		str+=vector[i].toString();
                str+=",";
            }
        return str + "]";
	}
    /**
     * Reverses the vector
     */
    public void reverse(){
        Object temp; 
        for(int i = 0; i<size()/2;i++){
            temp=vector[i];
            vector[i]=vector[size-i-1];
            vector[size-i-1]=temp;
            
        }
        
    }
    /**
     * Merges the vector and the clone vector
     * @param vector2 meant to represent the clone vector 
     */
    public void merge(MyVector vector2){
        int oldSize = size;
        ensureCapacity(vector2.size);
        for(int i=0;i<vector2.size;i++){
            vector[oldSize+1]=vector2.vector[i];
        }
    }

    public static void splice(MyVector full, MyVector left, MyVector right){
        for(int i = 0; i<full.size()/2;i++){
            left.append(full.elementAt(i));
        }
        for(int i = full.size()/2; i<full.size();i++){
            right.append(full.elementAt(i));
        }

    }
}
