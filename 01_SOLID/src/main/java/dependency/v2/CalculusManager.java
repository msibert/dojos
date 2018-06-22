package dependency.v2;

import openclose.v4.Calculator;
import openclose.v4.Shape;

import java.util.List;

/**
 * Created by msibert on 18/4/18.
 */
public class CalculusManager {

    private final Calculator calculator;

    public CalculusManager(Calculator calculator){
        this.calculator = calculator;
    }

    public double veryVeryDificultStuff(List<Shape> shapes){
        return calculator.calculateArea(shapes);
    }

}
