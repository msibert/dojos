package openclose.v4;

/**
 * Created by msibert on 18/4/18.
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.radius * Math.PI;
    }
}
