package miras;

public class Circle extends Shape{

    double radius;

    Circle(double radius,String name) {
        super(name);
        this.radius = radius;
    }




    @Override
    public String toString() {
        return "[radius=" + radius + "]";
    }



    @Override
    public boolean equals(Object obj) {

        Circle other = (Circle) obj;
        return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
    }



}