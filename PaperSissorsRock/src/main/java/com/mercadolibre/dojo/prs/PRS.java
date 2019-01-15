package com.mercadolibre.dojo.prs;

import com.mercadolibre.dojo.prs.challenge.Challenge;
import com.mercadolibre.dojo.prs.entities.Hand;

import java.util.Arrays;
import java.util.List;

/**
 * Mercado Libre - CHO
 * Created on 15/1/19.
 */
public class PRS {
    public Hand challenge(Hand hand1, Hand hand2) {
        List<Hand> hands = Arrays.asList(hand1,hand2);
        Challenge challenge = new Challenge(hands);
        return challenge.check();
    }
}
