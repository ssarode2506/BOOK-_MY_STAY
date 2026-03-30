import java.util.ArrayList;
import java.util.List;

/**
 * Model representing a guest's reservation.
 */
class Reservation {
    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() { return guestName; }
    public String getRoomType() { return roomType; }
}

/**
 * Maintains a record of confirmed reservations.
 */
class BookingHistory {
    private List<Reservation> history = new ArrayList<>();

    public void addReservation(Reservation reservation) {
        history.add(reservation);
    }

    public List<Reservation> getHistory() {
        return history;
    }
}

/**
 * Generates summaries and reports from stored booking data.
 */
class BookingReportService {
    /**
     * Displays a summary report of all confirmed bookings.
     *
     * @param history booking history
     */
    public void generateReport(BookingHistory history) {
        System.out.println("Booking History Report");
        for (Reservation res : history.getHistory()) {
            System.out.println("Guest: " + res.getGuestName() + ", Room Type: " + res.getRoomType());
        }
    }
}

/**
 * MAIN CLASS UseCase8BookingHistoryReport
 * Use Case 8: Booking History & Reporting
 */
public class HotelManagementSystem{

    public static void main(String[] args) {
        // Display application header
        System.out.println("Booking History and Reporting\n");

        BookingHistory history = new BookingHistory();

        // Simulating confirmed bookings being added to history
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        // Generate and display the report
        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(history);
    }
}