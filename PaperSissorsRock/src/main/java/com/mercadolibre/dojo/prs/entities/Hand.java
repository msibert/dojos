package com.mercadolibre.dojo.prs.entities;

/**
 * Mercado Libre - CHO
 * Created on 15/1/19.
 */
public interface Hand extends ComparableHands {

    String getName() ;

    Hand challenge(Hand hand);

}
