import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BookingService {

    public static String BOOKINGS_FILE_PATH = "src/txtFiles/bookings.txt";
    public static String BOOKS_FILE_PATH = "src/txtFiles/books.txt";

    public static String readBooking(String path) {
        String msg = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                msg += riga + "\n";
            }
        } catch (IOException e) { System.out.println("Error while reading file"); }
        return msg;
    }

    private static Booking getBooking(String riga) {
        String[] info = riga.split(";");
        String owner = info[0];
        String firstHour = info[1];
        String lastHour = info[2];
        String date = info[3];
        String avaiable = info[4];
        int code = Integer.parseInt(info[5]);

        return new Booking(owner, firstHour, lastHour, date, avaiable, code);
    }

    public static ArrayList<Booking> getBookingsList(String path) {
        ArrayList<Booking> bookingList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                bookingList.add(getBooking(riga));
            }
        } catch (IOException e) { System.out.println("Error while reading the file."); }
        return bookingList;
    }

    public static void emptyFile(String path) {
        try (FileWriter fw = new FileWriter(path)) {}
        catch (IOException e) { System.out.println("Error while deleting the file."); }
    }

    public static void writeContentsFile(String path, ArrayList<String> contenuto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (int i = 0; i < contenuto.size(); i++) {
                String riga = contenuto.get(i);
                bw.write(riga);
                bw.newLine();
            }
        } catch (IOException e) { System.out.println("Errore while writing the file."); }
    }

    public static void addNewBooking(String path, Booking booking) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(booking.toString());
            bw.newLine();
        } catch (IOException e) { System.out.println("Errore while writing the file."); }
    }

    public static void editBooking(String path, int toEditCode, Booking newBooking) {
        ArrayList<String> contents = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String riga;
            String modifiedRiga = "";
            while ((riga = br.readLine()) != null) {
                String[] parti = riga.split(";");
                int codice = Integer.parseInt(parti[5]);
                if (codice == toEditCode) {
                    riga = newBooking.toString();
                }
                contents.add(riga);
            }
        } catch (IOException e) { System.out.println("Error while trying to edit booking"); }
        emptyFile(path);
        writeContentsFile(path, contents);
    }

    public static void removeBooking(String path, int toRemoveCode) {
        ArrayList<String> contents = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                String[] parti = riga.split(";");
                int codice = Integer.parseInt(parti[5]);
                if (codice != toRemoveCode) { contents.add(riga); }
            }
        } catch (IOException e) { System.out.println("Error while trying to remove booking."); }
        emptyFile(path);
        writeContentsFile(path, contents);
    }
}