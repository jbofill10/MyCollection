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
public class MySet extends MyVector implements Cloneable{
    /**
     * Returns the set
     * @return 
     */
    public String cardinality(){
        return super.toString();
    }
    /**
     * Complements both sets and returns a new one
     * @param B the set which to complement with
     * @return new set
     */
    public MySet complement(MySet B){
        MySet temp = this.clone();
        for (int i=0;i<B.size();i++){
            temp.remove(B.elementAt(i));    
        }
        return temp;
        }
    /**
     * Adds an element into the set 
     * @param element the element being added
     */
    public void add(Object element){
        if (!contains(element)){
            super.append(element);
        }
    }
    /**
     * Intersects the two sets 
     * @param B the other set being intersected
     * @return a new set 
     */
    public MySet intersection(MySet B){
        MySet temp = new MySet();
        for (int i = 0; i < B.size(); i++) {
            if (this.contains(B.elementAt(i))){ 
                temp.add(B.elementAt(i));    
            }
        }
        return temp;
    }
    /**
     * Returns the subset of two sets
     * @param B the other set
     * @return new set 
     */
    public boolean subsetOf(MySet B) {
        if (this.size() > B.size()) {return false;}    
        for (int i = 0; i < this.size(); i++) {
            if (!B.contains(this.elementAt(i)));    
        }
        return true;
    }
    /**
     * Takes the symmetric difference of two sets
     * @param B the other set
     * @return new set 
     */
    public MySet symmetricDifference(MySet B){
        MySet temp1 = complement(B);
        MySet temp2 = B.complement(this);
        MySet temp = temp1.union(temp2);
        return temp;
    }
    /**
     * Takes the union of two sets 
     * @param B the other set
     * @return new set 
     */
    public MySet union(MySet B){
        MySet temp = this.clone();
        for (int i = 0; i < B.size(); i++) {
            temp.add(B.elementAt(i));
        }
        return temp;
    }
    /**
     * Used to create clones of the sets in order to return a new set from each method
     * @return a cloned set 
     */
    @Override
    public MySet clone(){        
        MySet clone = new MySet();
        clone.ensureCapacity(size());
        for(int i=0;i<size();i++){
            clone.vector[i]=vector[i];
        }
        clone.size=size;
        return clone;
    }
    
}
