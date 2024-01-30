package net.ugurkartal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Icebreaker");
        book1.setAuthor("Hannah Grace");
        book1.setIsbn("516151154891561");

        Book book2 = new Book();
        book2.setTitle("Stop Overthinking");
        book2.setAuthor("Nick Trenton");
        book2.setIsbn("456456564987849");

        Library library = new Library();
        library.books = new Book[]{book1, book2};

        System.out.println("Library1: " + library + "\n");


        //For Bonus Task:
        Book book3 = new Book();
        book3.setTitle("Ikigai");
        book3.setAuthor("Hector García");
        book3.setIsbn("54894156489498");

        Book book4 = new Book();
        book4.setTitle("Read People Like a Book");
        book4.setAuthor("Patrick King");
        book4.setIsbn("5645615641564654");

        Library library2 = new Library();
        library2.addBook(book3, book4);
        System.out.println("Library2: " +  library2 + "\n");
        library2.deleteBook(book3);
        System.out.println("After delete Library2: " + library2 + "\n");
    }
}