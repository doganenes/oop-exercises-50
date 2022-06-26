public class Main {

    public static void main(String[] args) {
        // write your code here

        Stock s1 = new Stock("A", "product");

        s1.setPrice(55.45);
        System.out.println(s1.getChangePercent());
    }
}
