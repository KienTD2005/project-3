package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag <T> implements Container<T>{
    List<T> list;

    public Bag() {
        this.list = new ArrayList<>();
    }
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean add(T item) {
        return this.list.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.list.iterator();
    }


}
