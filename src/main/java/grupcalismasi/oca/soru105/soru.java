package grupcalismasi.oca.soru105;

import java.time.LocalDate;
import java.util.Locale;

public class soru {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,01,32);
        date.plusDays(10);
        System.out.println(date);
    }// Invalid value for DayOfMonth (valid values 1 - 28/31): 32
}
