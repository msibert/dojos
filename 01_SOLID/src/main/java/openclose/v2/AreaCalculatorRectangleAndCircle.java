package openclose.v2;

import openclose.v1.Rectangle;

import java.util.List;

/**
 * Created by msibert on 18/4/18.
 */
public class AreaCalculatorRectangleAndCircle {

    public double calculateArea(List<Object> shapes)
    {
        double area = 0;
        for (Object shape : shapes)

        {
            if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth()*rectangle.getHeight();
            }else{
                Circle circle = (Circle) shape;
                area += circle.getRadius() * Math.PI;
            }

        }

        return area;
    }
}
