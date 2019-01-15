package com.mercadolibre.dojo.prs.entities;

/**
 * Mercado Libre - CHO
 * Created on 15/1/19.
 */
public class Loser implements Hand {

    public static String NAME = "LOSER";

    @Override
    public String getName() {
        return NAME;
    }

    /**
     * Always loose and return the opponent
     * @param hand
     * @return
     */
    @Override
    public Hand challenge(Hand hand) {
        return hand;
    }

    @Override
    public Hand compare(Sissors sissors) {
        return sissors;
    }

    @Override
    public Hand compare(Rock rock) {
        return rock;
    }

    @Override
    public Hand compare(Paper paper) {
        return paper;
    }
}
