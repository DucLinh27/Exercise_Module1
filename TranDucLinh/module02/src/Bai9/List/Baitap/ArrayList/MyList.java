package Bai9.List.Baitap.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity " + capacity);
        }
    }

    public int size() {
        return this.size;
    }
    //Don dep  cac ptu
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }
    //Them ptu
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = elements;
            size++;
        } else {
            for (int i = 0; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }
    public E get(int index){
        return (E) elements[index];
    }
    //Kiem tra vi tri cua phan tu
    public int indexOf(E element){
        int index = -1;
        for (int i = 0 ; i < size; i++){
            if(this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    //Kiem tra 1 phan tu co trong MyList
    public boolean contains ( E element){
        return this.indexOf(element) >= 0;
    }
    //Tao ra ban sao cua MyList
    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }
    public E remove(int index){
        if(index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index" + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size ; i++) {
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size --;
        return element;
    }
}

