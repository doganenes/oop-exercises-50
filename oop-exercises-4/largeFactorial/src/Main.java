import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer");
        int n = scan.nextInt();
        System.out.println(n + "! is \n" + factorial(n));

    }

    public static BigInteger factorial(long n) {

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + " "));

        }
        return result;

    }
}
