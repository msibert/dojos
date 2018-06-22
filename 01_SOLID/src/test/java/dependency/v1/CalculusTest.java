package dependency.v1;

import dependency.v1.VeryDifficultCalculusManagerAndStuff;
import dependency.v2.CalculusManager;
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

/**
 * Created by msibert on 18/4/18.
 */

public class CalculusTest {


    @Test
    public void testVeryDifficultCalculusManagerAndStuff() {

        List<Shape> shapes = Stream
                .of(new Rectangle(10, 20), new Circle(10), new Triangle(10, 5))
                .collect(Collectors.toList());

        double area = new VeryDifficultCalculusManagerAndStuff().veryVeryDificultStuff(shapes);

        System.out.println ("[testVeryDifficultCalculusManagerAndStuff] AREA: "+area);

        assertEquals(256.415,area,0.1);

    }

}
