public class Circle extends GeometricObject {
    private double radius;

    // creating constructors
    public Circle() {// empty constructor

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {

        this.radius = radius;
        setColor(color);
        setFilled(filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getPerimeter() {
        return 2 * radius * radius;
    }

    // printing info for circle object
    public void showInfo() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
