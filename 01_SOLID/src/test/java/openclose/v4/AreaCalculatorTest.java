package openclose.v4;

import openclose.v4.Circle;
import openclose.v4.FunctionalAreaCalculator;
import openclose.v4.Rectangle;
import openclose.v4.Shape;
import openclose.v4.TheRealAreaCalculator;
import openclose.v4.Triangle;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class AreaCalculatorTest{

    @Test
    public void testTheRealAreaCalculator() {


        List<Shape> shapes = Stream
                .of(new Rectangle(10, 20), new Circle(10), new Triangle(10, 5))
                .collect(Collectors.toList());

        double area = new TheRealAreaCalculator().calculateArea(shapes);

        System.out.println ("AREA: "+area);

        assertEquals(256.415,area,0.1);

    }

    @Test
    public void testFunctionalAreaCalculator() {


        List<Shape> shapes = Stream
                .of(new Rectangle(10, 20), new Circle(10), new Triangle(10, 5))
                .collect(Collectors.toList());

        double area = new FunctionalAreaCalculator().calculateArea(shapes);

        System.out.println ("AREA: "+area);

        assertEquals(256.415,area,0.1);

    }

}