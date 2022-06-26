public class Main {

    public static void main(String[] args) {

        DateTime dateTime = new DateTime();
        System.out.println("Milliseconds at that time: " + dateTime.nowMillis());
        System.out.println();
        System.out.println("After the desired times:");
        System.out.println(dateTime.toString());

    }
}
