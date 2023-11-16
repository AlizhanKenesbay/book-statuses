public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Собачье сердце");

        BookMover availableStatusMover = new FromAvailableStatusMover();
        BookMover borrowedStatusMover = new FromBorrowedStatusMover();
        BookMover archivedStatusMover = new FromArchivedStatusMover();
        BookMover overduedStatusMover = new FromOverduedStatusMover();

        availableStatusMover.moveToStatus(book1, Status.BORROWED);
        borrowedStatusMover.moveToStatus(book1, Status.OVERDUED);
        overduedStatusMover.moveToStatus(book1, Status.ARCHIVED);
        archivedStatusMover.moveToStatus(book1, Status.AVAILABLE);
    }
}