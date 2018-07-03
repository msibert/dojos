package com.mercadolibre.dojos;

/**
 * Mercado Libre - CHO
 * Created on 29/6/18.
 */
public class PeopleCapacity implements ClassRoomProperty {
    private final Integer capacity;

    public PeopleCapacity(int capacity) {
        this.capacity = capacity;

    }

    @Override
    public boolean matches(ClassRoom classRoom) {
        return capacity <= classRoom.getPeopleCapacity().capacity;
    }
}
