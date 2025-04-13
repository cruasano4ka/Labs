package org.example;

import org.example.model.Flat;

import java.util.Collection;

public class CollectionManager {

    private Collection<Flat> collection;

    public Collection<Flat> getCollection() {
        return collection;
    }

    public void setCollection(Collection<Flat> collection) {
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
        try {
            collection.remove(getFlatById(id));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}
