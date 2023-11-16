public class FromArchivedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String error = "Can not move book from status %s to %s%n";
        if (book.getStatus() != Status.ARCHIVED) {
            System.out.printf(error, book.getStatus(), requestedStatus);
            return;
        }
        switch (requestedStatus) {
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE);
                System.out.println("Moving is completed");
            }
            default -> System.out.printf(error, book.getStatus(), requestedStatus);
        }
    }
}