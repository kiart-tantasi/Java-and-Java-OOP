import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyDate {

    public static void main(String[] args) {
        System.out.println("LocalDate: " + LocalDate.now());
        System.out.println("LocalTime: " + LocalTime.now());
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("\n");

        try {
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
            String formattedDate = date.format(formatter);
            System.out.println("formattedDate: " + formattedDate);

            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter secondFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
            String formattedDateTime = dateTime.format(secondFormatter);
            System.out.println("formattedDateTime: " + formattedDateTime);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (DateTimeException e) {
            System.out.println(e);
        }
        // format
        // yyyy-MM-dd
        // dd/MM/yyyy
        // dd-MMM-yyy - "29-Sep-1988"
        //E, MMM dd yyy - "Thu, Sep 29 1988"

    }
}
