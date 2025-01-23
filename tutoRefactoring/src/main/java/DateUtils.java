import java.time.LocalDate;

public class DateUtils {


    static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate now, boolean inclusive) {
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }

    public static boolean isNowBetween (LocalDate startingDate, LocalDate endingDate) {
        final LocalDate now = LocalDate.now();
        return isDateBetween(startingDate, endingDate, now, true);
    }
}