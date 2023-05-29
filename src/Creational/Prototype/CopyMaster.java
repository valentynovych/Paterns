package Creational.Prototype;

public class CopyMaster {
    public static void main(String[] args) {
        Book originalBook = new Book(1, "War and Peace", 1225,
                new String[]{"Tolstoy", "began", "writing", "War and Peace", "in 1863,", "the year that",
                "he finally", "married and settled down at his country estate"});
        System.out.println(originalBook);
        System.out.println(" - - - - - - - - - - - - - - ");

        BookFactory bookFactory = new BookFactory(originalBook);
        Book copyBook = bookFactory.cloneBook();
        System.out.println(copyBook);
    }
}
