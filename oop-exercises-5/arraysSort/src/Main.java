import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] cities = {"Boston", "Atalanta", "Hawaii", "Chicago"};
        Arrays.sort(cities);

        for (String str : cities) {
            System.out.print(str + " ");
        }

        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("235334888348483"), new BigInteger("48646868486684468468"),
                new BigInteger("64486484846464883")};

        Arrays.sort(hugeNumbers);

        for (BigInteger bg : hugeNumbers) {
            System.out.print(bg + " ");
        }
    }
}
