package openclose.v4;

/**
 * Created by msibert on 18/4/18.
 */
public class Rectangle implements Shape {

    final double width;
    final double height;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height*this.width;
    }
}
