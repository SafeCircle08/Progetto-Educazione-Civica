import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Booking booking = new Booking("Michele", "20:00", "22:00", "02/01/2026", "NOT AVAIABLE", 101);
        Booking booking2 = new Booking("Kromer", "18:00", "21:00", "02/05/2026", "NOT AVAIABLE", 104);
        Booking modifedBook = new Booking("Modificato", "Modificato","Modificato","Modificato","Modificato", 500);

        BookingService.emptyFile(BookingService.BOOKS_FILE_PATH);
        BookingService.emptyFile(BookingService.BOOKINGS_FILE_PATH);
    }
}