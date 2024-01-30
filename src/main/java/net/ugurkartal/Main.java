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

        System.out.println(library);
    }
}