public class BodyMassIndex {

    private String name;
    private int age;
    private double height;
    private double weight;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BodyMassIndex(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {

        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));

        return Math.round(bmi * 100) / (double) 100;

    }

    public String getStatus() {

        double bmi = getBMI();

        if (bmi < 18.5) {
            return "UNDERWEIGHT";
        }

        if (bmi < 25.0) {
            return "NORMAL";
        }
        if (bmi < 30.0) {
            return "OVERWEIGHT";
        } else {
            return "OBESE";
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
