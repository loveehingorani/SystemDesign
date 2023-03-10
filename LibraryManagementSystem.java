import java.sql.Date;

import java.util.List;



class LibraryManagementSystem {

    public static void main(String[] args) {
        
        //driver code

    }

}

class User {
    int id;
    String name;
    String email;
    String password;
    String phoneNumber;

}

class Book {
    int bookId;
    String bookName;
    int bookCount;
    String barcode; //primary key
    String rackNumber;
    BookStatus bookStatus;
}

public enum BookStatus {
    ISSUED,
    AVAILABLE,
    RESERVED,
    LOST
}

class Member extends User {
    int issueCount;
    String barcode;
    Search search;
    int fine;
    List < Booking > bookings = new ArrayList < > ();
    List < Reservation > reservations = new ArrayList < > ();
    BookingService bookingService;

}

class BookingService {

    public void issueBook(Booking booking) {}

    public void reserveBook(Reservation reservation) {}

    public void renewBooking(int bookingId) {}

    public void returnBook(int bookingId) {}
}



class Admin extends User {

    Search search;
    BookingService bookingService;
    
    public List < Booking > getAllBookingsOfMember(int id) {}
    public void addBook(Book book) {}
    public void removeBook(int bookId) {}
    public void editBook(Book book) {}
    public Member getMemberDetailsFromBookId(int bookId) {}
    public List < Booking > getBookingDetailsFromBookId(int bookId) {}
}



class Search {

    public List < Book > search(String searchKey) {}

}



class Booking {

    int bookingId;
    Member member;
    Book book;
    Date issuedDate;
    Date returnDate;
    int renewCount;
    BookingStatus bookingStatus;
}


class Reservation {
    int memberId;
    int bookId;
    Date reservedDate;
}

enum BookingStatus {

    OPEN,
    CLOSED

}

// factory design pattern for notifications

class NotificationFactory {

    public Notification getNotification(NotificationType notificationType) {}

}

enum NotificationType {

    SMS,
    EMAIL

}

interface Notification {

    public void sendNotification();

}

class smsNotification implements Notification {

    @Override

    public void sendNotification() {}

}

class emailNotifcation implements Notification {

    @Override

    public void sendNotification() {}

}
