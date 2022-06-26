public class Circle {

    private int radius = 1;

    public Circle() {

        System.out.println("Perimeter is: " + (Math.PI * 2 * radius));
        System.out.println("Area is: " + (Math.PI * radius * radius));


    }

    public Circle(int radius) {

        System.out.println("Perimeter is: " + (Math.PI * 2 * radius));
        System.out.println("Area is: " + (Math.PI * radius * radius));

    }

    public int getArea(int radius) {

        return (int) (Math.PI * radius * radius);
    }


}
