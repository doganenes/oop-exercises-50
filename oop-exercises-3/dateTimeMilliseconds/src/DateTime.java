import java.util.*;

public class DateTime {
    private long dateTimeNow;

    public long nowMillis() {

        Date d = new Date();
        dateTimeNow = d.getTime();
        return dateTimeNow;
    }

    public String toString() {
        return "After 10000s: " + (nowMillis() + 10000 +
                "\nAfter 100000s: " + (nowMillis() + 100000) +
                "\nAfter 1000000s: " + (nowMillis() + 1000000) +
                "\nAfter 10000000s: " + (nowMillis() + 10000000) +
                "\nAfter 100000000s: " + (nowMillis() + 100000000) +
                "\nAfter 1000000000s: " + (nowMillis() + 1000000000));

    }
}
