import java.util.*;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is: " + new Date()); // şimdiki zamanı verir.
        System.out.println("Year: " + calendar.get(Calendar.YEAR)); // şu anki yılı verir.
        System.out.println("Monday: " + calendar.get(Calendar.DATE));// ayın kaçıncı günü olduğunu verir.
        System.out.println("Hour of Day: " + calendar.get(Calendar.HOUR)); //günün hangi saatinde olduğumuzu verir.
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE)); // şu andaki dakikayı verir.
        System.out.println("Milliseconds: " + calendar.get(Calendar.MILLISECOND)); // şu andaki zamanı millisecond cinsinden verir.
        System.out.println("Day of year: " + calendar.get(Calendar.DAY_OF_YEAR)); // yılın kaçıncı gününde olduğumuzu verir.
        System.out.println("Month of year: " + calendar.get(Calendar.DAY_OF_MONTH)); // yılın kaçıncı ayında olduğumuzu verir.
        System.out.println("Week of year: " + calendar.get(Calendar.WEEK_OF_YEAR)); // yılın kaçıncı haftasında olduğumuzu verir.

        Calendar calendar1 = new GregorianCalendar(2005, 10, 25); //YYYY, MM,DD
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Day name of the October 25 is: " + daysOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
    }

}