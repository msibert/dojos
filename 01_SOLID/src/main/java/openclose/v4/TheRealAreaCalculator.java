package openclose.v4;

import java.util.List;

/**
 * Created by msibert on 18/4/18.
 */
public class TheRealAreaCalculator implements Calculator {

    public double calculateArea(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes){
            area += shape.calculateArea();
        }

        return area;
    }
}
