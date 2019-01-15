package com.mercadolibre.dojo.prs;

import com.mercadolibre.dojo.prs.entities.Hand;
import com.mercadolibre.dojo.prs.entities.Paper;
import com.mercadolibre.dojo.prs.entities.Rock;
import com.mercadolibre.dojo.prs.entities.Sissors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void paperBeatsRockTest()
    {
        PRS app = new PRS();
        Hand result = app.challenge(new Paper(), new Rock());

        assertEquals(new Paper().getName(), result.getName());

    }

    @Test
    public void paperBeatsRockAlwaysTest()
    {
        PRS app = new PRS();
        Hand result = app.challenge( new Rock(),new Paper());

        assertEquals(new Paper().getName(), result.getName());

    }

    @Test
    public void rockBeatsSissorsTest()
    {
        PRS app = new PRS();
        Hand result = app.challenge(new Sissors(), new Rock());

        assertEquals(new Rock().getName(), result.getName());

    }

    @Test
    public void sissorsBeatsRockAlwaysTest()
    {
        PRS app = new PRS();
        Hand result = app.challenge(new Rock(),new Sissors());

        assertEquals(new Rock().getName(), result.getName());

    }

    @Test
    public void sissorsBeatsPaperTest()
    {
        PRS app = new PRS();
        Hand result = app.challenge(new Rock(),new Paper());

        assertEquals(new Paper().getName(), result.getName());

    }

    @Test
    public void sissorsBeatsPaperAlwaysTest()
    {
        PRS app = new PRS();
        Hand result = app.challenge(new Paper(),new Rock());

        assertEquals(new Paper().getName(), result.getName());

    }
}
