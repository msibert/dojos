package openclose.v1;

import java.util.List;

/**
 * Created by msibert on 18/4/18.
 */
public class AreaCalculator {

    public double calculateArea(List<Rectangle> shapes)
    {
        double area = 0;
        for (Rectangle shape : shapes)
        {
            area += shape.getWidth()*shape.getHeight();
        }

        return area;
    }
}
