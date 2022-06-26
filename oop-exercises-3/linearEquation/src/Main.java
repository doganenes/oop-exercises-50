public class Main {

    public static void main(String[] args) {

        LinearEquation l1 = new LinearEquation(5, 3, 8, 1, 3, 6);

        System.out.println(l1.getX());
        System.out.println(l1.getY());

        System.out.println();
        LinearEquation l2 = new LinearEquation(7, 3, 1, 6, 9, 4);
        System.out.println(l2.getX());
        System.out.println(l2.getY());
    }
}
