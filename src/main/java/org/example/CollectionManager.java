package org.example;

import org.example.model.Flat;

import java.util.Collection;
import java.util.PriorityQueue;

public class CollectionManager {

    private PriorityQueue<Flat> collection;

    public PriorityQueue<Flat> getCollection() {
        return collection;
    }

    public void setCollection(PriorityQueue<Flat> collection) {
        this.collection = collection;
    }

    public Flat getFlatById(Long id) {
        for (Flat flat : collection) {
            if (flat.getId().equals(id)) {
                return flat;
            }
        }
        throw new NullPointerException("Квартиры с таким id нету) ");
    }

    public void removeById(Long id) {
        collection.remove(getFlatById(id));
    }

}
