package com.mercadolibre.dojos;

/**
 * Mercado Libre - CHO
 * Created on 29/6/18.
 */
public class SquareMetersCapacity implements ClassRoomProperty{
    private final Integer capacity;

    public SquareMetersCapacity(Integer capacity) {
        this.capacity = capacity;
    }


    @Override
    public boolean matches(ClassRoom classRoom) {
        return capacity <= classRoom.getSquareMetersCapacity().capacity;
    }
}
