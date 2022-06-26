public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        System.out.println("C1 circle is created: " + c1.toString());
        c1.setColor("red");
        c1.setRadius(3);
        System.out.println("Color of the C1 circle is: " + c1.getColor());
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The diameter is: " + c1.getDiameter());
        System.out.println("Area of the C1 circle is: " + c1.getArea());
        c1.showInfo();

        System.out.println();
        System.out.println();

        Rectangle r1 = new Rectangle(2, 4);
        r1.setColor("blue");
        r1.setWidth(4);
        System.out.println("Rectangle is created: " + r1.toString());
        System.out.println("Area of the rectangle is: " + r1.getArea());
        System.out.println("Perimeter of the rectangle is: " + r1.getPerimeter());
        System.out.println(r1.toString());

    }


}
