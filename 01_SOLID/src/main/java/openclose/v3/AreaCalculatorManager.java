package openclose.v3;

import openclose.v1.Rectangle;
import openclose.v2.Circle;

import java.util.List;

/**
 * Created by msibert on 18/4/18.
 */
public class AreaCalculatorManager {

    public double calculateArea(List<Object> shapes)
    {
        double area = 0;
        for (Object shape : shapes)

        {
            if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getWidth()*rectangle.getHeight();
            }else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                area += triangle.base * triangle.height / 2;
            }else{
                Circle circle = (Circle) shape;
                area += circle.getRadius() * Math.PI;
            }

        }

        return area;
    }
}
