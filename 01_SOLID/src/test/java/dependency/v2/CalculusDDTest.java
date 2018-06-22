package dependency.v2;

import openclose.v4.Calculator;
import openclose.v4.Circle;
import openclose.v4.FunctionalAreaCalculator;
import openclose.v4.Rectangle;
import openclose.v4.Shape;
import openclose.v4.TheRealAreaCalculator;
import openclose.v4.Triangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by msibert on 18/4/18.
 */
@RunWith(Parameterized.class)
public class CalculusDDTest {

    @Parameterized.Parameters(name = "{index}: Test with {0}, result: {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new TheRealAreaCalculator(),256.415},
                {new FunctionalAreaCalculator(),256.415}
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public Calculator calculator;
    @Parameterized.Parameter(1)
    public double expected;

    @Test
    public void test() {
        List<Shape> shapes = Stream
                .of(new Rectangle(10, 20), new Circle(10), new Triangle(10, 5))
                .collect(Collectors.toList());
        System.out.println("Testing ["+calculator.getClass().getCanonicalName()+"]");
        assertEquals(expected, new CalculusManager(calculator).veryVeryDificultStuff(shapes), 0.001);
    }
}
