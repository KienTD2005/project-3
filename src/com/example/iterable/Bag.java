package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

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

    @Override
    public void forEach(Consumer<? super T> action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Container.super.spliterator();
    }
}
