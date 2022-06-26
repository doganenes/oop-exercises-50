import java.util.*;

public class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    //creating constructors
    public GeometricObject() {

        dateCreated = new Date(); // constructor her çağrıldığında bugünün tarihi oluşturulur.

    }

    public GeometricObject(String color, boolean filled) {

        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {

        return filled;

    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {

        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

    }

}
