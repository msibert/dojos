package com.mercadolibre.dojos;

import java.util.ArrayList;
import java.util.List;

/**
 * Mercado Libre - CHO
 * Created on 29/6/18.
 */
public class CauSystem {
    private final ClassRoomStorage storage;
    private final List<ClassRoomProperty> filters = new ArrayList<ClassRoomProperty>();

    public CauSystem(ClassRoomStorage roomStorage) {
        this.storage = roomStorage;

    }

    public CauSystem havingAtLeast(ClassRoomProperty prop) {
        this.filters.add(prop);
        return this;
    }

    public ClassRoom findFirst() {
        return  this.storage.asStream()
                .filter(room -> room.filter(filters))
                .findFirst()
                .orElse(new ClassRoom("none"));
    }
}