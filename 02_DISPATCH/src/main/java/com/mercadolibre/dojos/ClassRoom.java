package com.mercadolibre.dojos;

import com.mercadolibre.dojos.filters.PeopleFilter;
import com.mercadolibre.dojos.filters.SquareMeterFilter;

import java.util.List;

public class ClassRoom  implements PeopleFilter, SquareMeterFilter {

    private final String label;
    private PeopleCapacity peopleCapacity = new PeopleCapacity(0);
    private SquareMetersCapacity squareMetersCapacity = new SquareMetersCapacity(0);


    public ClassRoom(String label) {
       this.label = label;
    }


    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object obj){
        return this.getLabel().equals(((ClassRoom)obj).getLabel());
    }

    public boolean filter(List<ClassRoomProperty> filters) {
        return filters.stream()
                .allMatch(filter -> filter.matches(this));
    }

    public ClassRoom has(PeopleCapacity peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
        return this;
    }

    public ClassRoom has(SquareMetersCapacity squareMetersCapacity) {
        this.squareMetersCapacity=squareMetersCapacity;
        return this;
    }

    public PeopleCapacity getPeopleCapacity() {
        return peopleCapacity;
    }

    public SquareMetersCapacity getSquareMetersCapacity() {
        return squareMetersCapacity;
    }
}
