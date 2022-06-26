public class Main {

    public static void main(String[] args) {
        BodyMassIndex b1 = new BodyMassIndex("Ali", 22, 187, 98);
        System.out.println(b1.getBMI());
        System.out.println(b1.getStatus());

        BodyMassIndex b2 = new BodyMassIndex("Selim", 32, 173, 79);
        System.out.println(b2.getBMI());
        System.out.println(b2.getStatus());

    }

}
