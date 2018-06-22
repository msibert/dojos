package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {


    @Before
    public void setup() {
    }

    @Test
    public void quiteDifficultTest() {

        String hello = new HelloWorld().sayHello();
        Assert.assertNotNull(hello);
    }


}
