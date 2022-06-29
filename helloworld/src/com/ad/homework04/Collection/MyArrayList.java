package com.ad.homework04.Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {

    //todo 顺序表实现
    private  Object[] elements;

    private int curr;

    public MyArrayList(){
        elements=new Object[16];
        curr=0;
    }

    @Override
    public int size() {
        return curr;
    }

    @Override
    public boolean isEmpty() {
        return curr==0;
    }

    @Override
    public boolean contains(Object o) {

        for (Object e : elements) {
           if(e.equals(o))
               return true;
        }

        return false;
    }

    @Override
    public void clear() {
       curr=0;
    }

    @Override
    public Object get(int index) {
        if(index>curr||index<0)

            //todo 抛出异常超越数组范围
            throw new IndexOutOfBoundsException("\"out of bound \" + curr + \" for \" + index");
        return elements[index];


    }
    @Override
    public boolean add(Object element) {
        if (curr== elements.length-1){
            Object[] temp=new Object[curr*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[curr]=element;
        curr++;
        return true;
    }

    @Override
    public void add(int index, Object element) {
        if (index>curr||index<0)
            throw new IndexOutOfBoundsException("\"out of bound \" + curr + \" for \" + index");
        if(index==curr-1)
        {
           add(element);
        return;
        }
        for (int i = elements.length-1; i <= index ; i--) {
            elements[i+1]=elements[i];
        }
        elements[index]=element;
            return;


    }
    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }


    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    /*
    @Override
     public void add(int index, Object element) {
        throw new UnsupportedOperationException();
    }
     */


    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }
}
