package com.mercadolibre.dojos;

public class ClassRoom {

    private final String Label;

    public ClassRoom(String label) {
        Label = label;
    }

    public String getLabel() {
        return Label;
    }

    @Override
    public boolean equals(Object obj){
        return this.getLabel().equals(((ClassRoom)obj).getLabel());
    }
}
