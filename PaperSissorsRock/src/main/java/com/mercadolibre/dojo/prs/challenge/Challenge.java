package com.mercadolibre.dojo.prs.challenge;

import com.mercadolibre.dojo.prs.entities.Hand;
import com.mercadolibre.dojo.prs.entities.Loser;

import java.util.List;

/**
 * Mercado Libre - CHO
 * Created on 15/1/19.
 */
public class Challenge {


    private final List<Hand> hands;

    public Challenge (List<Hand> hands){
        this.hands = hands;
    }

    public Hand check (){
        Hand result = new Loser();

        for(Hand hand : hands)
        {
            result = result.challenge(hand);
        }


        return result;
    }
}
