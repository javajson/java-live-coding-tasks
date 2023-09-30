package com.github.stokito.interview;

import java.rmi.*;
import java.util.*;

public class AList {

    private int initialCapacity;
    private int size;
    private static final int CAPACITY = 10;
    String[] elements;

    public AList() {
        elements = new String[0];
        size = 0;
    }

    public AList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
        elements = new String[initialCapacity];
        size = initialCapacity;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public void add(String e) {
        if (size < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        elements = Arrays.copyOf(elements, ++size);
        elements[size()-1] = e;
    }

    public void add(int index, String e) {

    }

    public String get(int index) {
        return elements[index];
    }

    public void set(int index, String e) {

    }

    public String remove(int index) {
        return null;
    }
}
