package com.mercadolibre.dojos;

import java.util.HashSet;
import java.util.Set;

public class ClassRoomStorage {

    private final Set<ClassRoom> classRooms = new HashSet<ClassRoom>();

    public void add(ClassRoom classRoom){
        if(classRoom != null){
            this.classRooms.add(classRoom);
        }
    }

    public boolean isClassRoomAvaliable(ClassRoom classRoom) {

        return this.classRooms.stream()
                .anyMatch(room -> room.equals(classRoom));
    }
}
