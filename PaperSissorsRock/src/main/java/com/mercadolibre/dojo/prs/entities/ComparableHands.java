package com.mercadolibre.dojo.prs.entities;

/**
 * Mercado Libre - CHO
 * Created on 15/1/19.
 */
public interface ComparableHands {

    Hand compare(Sissors sissors);

    Hand compare(Rock rock);

    Hand compare(Paper paper);
}
