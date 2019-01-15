package com.mercadolibre.dojo.prs.entities;

/**
 * Mercado Libre - CHO
 * Created on 15/1/19.
 */
public class Paper implements Hand{

    public static String NAME = "PAPER";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Hand challenge(Hand hand) {
        return hand.compare(this);
    }

    @Override
    public Hand compare(Sissors sissors) {
        return sissors;
    }

    @Override
    public Hand compare(Rock rock) {
        return this;
    }

    @Override
    public Hand compare(Paper paper) {
        return this;
    }
}
