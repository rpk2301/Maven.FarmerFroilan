package com.zipcodewilmington.froilansfarm;


import java.util.ArrayList;

public class Storage<T> {
    ArrayList<T> storage = new ArrayList<T>();
    private int index;


    public void addT(T t) {
        storage.add(t);
    }


    public ArrayList<T> getStorage() {
        return storage;
    }

    public T getT(int index){
        if (index >= 0 && index < storage.size()) {
            return storage.get(index);
        }
        return null;

    }
}
