package miras;

public class Shape {
    protected String name;

    public Shape(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println(name + " draw");
    }

    public void erase() {
        System.out.println(name + " erase");
    }

    public double calculateArea() {

        return 0;
    }

    public double calculateCircumference() {
        return 0;
    }

}