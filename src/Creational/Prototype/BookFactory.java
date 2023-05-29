package Creational.Prototype;

public class BookFactory {
    Book book;

    public BookFactory(Book book){
        this.book = book;
    }

    Book cloneBook(){
        return (Book) book.copy();
    }
}
