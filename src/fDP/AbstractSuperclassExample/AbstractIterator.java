/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fDP.AbstractSuperclassExample;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Andrew Searles
 */
abstract public class AbstractIterator implements Iterator {
    private Object nextElement;
    
    protected void init() {
        nextElement = getNextElement();
    }
    
    public abstract Object getNextElement();
    
    @Override
    public boolean hasNext(){
        return nextElement!=this;
    }
    
    @Override
    public Object next(){
        if (nextElement==this){
            throw new NoSuchElementException();
        }
        Object previous = nextElement;
        nextElement = getNextElement();
        return previous;
    }
    
    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
