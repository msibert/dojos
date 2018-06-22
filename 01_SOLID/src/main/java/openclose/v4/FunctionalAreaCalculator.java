package openclose.v4;

import java.util.List;

/**
 * Created by msibert on 18/4/18.
 */
public class FunctionalAreaCalculator implements Calculator {

    public double calculateArea(List<Shape> shapes)
    {
        return shapes.stream()
                //.parallel()  //will return no surprising result
                .mapToDouble(p -> p.calculateArea()).sum();
    }
}
