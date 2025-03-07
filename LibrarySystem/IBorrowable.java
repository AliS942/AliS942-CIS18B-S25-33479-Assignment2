// Interface for borrowable items
public interface IBorrowable {
    void borrowItem(String borrower);
    void returnItem();
    boolean isBorrowed();
}
