public class Main {

    public static void main(String[] args) {

        Fan f1 = new Fan();
        f1.getOn();
        System.out.println(f1.toString());

        Fan f2 = new Fan();
        f2.getOn();
        f2.setColor("green");
        f2.setRadius(15);
        f2.setSpeed(3);

        System.out.println(f2.toString());

    }
}
