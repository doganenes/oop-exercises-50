public class Rectangle {

    private int width = 1; // default value
    private int height = 1; // default value

    public Rectangle() {
    }

    public Rectangle(int width, int height) {

        this.width = width;
        this.height = height;

    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }
}
