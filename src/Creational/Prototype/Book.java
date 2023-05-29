package Creational.Prototype;

import java.util.Arrays;

public class Book implements Copyble {
    private final int bookId;
    private final String bookName;
    private final int numberOfPage;
    private final String[] bookText;

    public Book(int bookId, String bookName, int numberOfPage, String[] bookText) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.numberOfPage = numberOfPage;
        this.bookText = bookText;
    }

    @Override
    public Object copy() {
        Book copyBook = new Book(bookId, bookName, numberOfPage, bookText);
        return copyBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", numberOfPage=" + numberOfPage +
                ", bookText=" + Arrays.toString(bookText) +
                '}';
    }
}
