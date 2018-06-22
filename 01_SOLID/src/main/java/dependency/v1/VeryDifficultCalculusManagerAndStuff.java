package dependency.v1;

import openclose.v4.FunctionalAreaCalculator;
import openclose.v4.Shape;

import java.util.List;

/**
 * Created by msibert on 18/4/18.
 */
public class VeryDifficultCalculusManagerAndStuff {

    FunctionalAreaCalculator calculator = new FunctionalAreaCalculator();


    public double veryVeryDificultStuff(List<Shape> shapes){
        return calculator.calculateArea(shapes);
    }

}
