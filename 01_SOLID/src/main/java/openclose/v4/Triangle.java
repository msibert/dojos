package openclose.v4;

/**
 * Created by msibert on 18/4/18.
 */
public class Triangle implements Shape {

    public double base;
    public double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height*this.base/2;
    }
}
