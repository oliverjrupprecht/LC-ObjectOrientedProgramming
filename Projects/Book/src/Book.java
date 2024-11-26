abstract class Book {
    private String bookTitle;
    private double bookPrice;

    public Book(String bookTitle, double bookPrice) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    abstract void setBookPrice();
}