public class FromAvailableStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String error = "Can not move book from status %s to %s%n";
        if (book.getStatus() != Status.AVAILABLE) {
            System.out.printf(error, book.getStatus(), requestedStatus);
            return;
        }
        switch (requestedStatus) {
            case BORROWED -> {
                book.setStatus(Status.BORROWED);
                System.out.println("Moving is completed");
            }
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED);
                System.out.println("Moving is completed");
            }
            default -> System.out.printf(error, book.getStatus(), requestedStatus);
        }
    }
}