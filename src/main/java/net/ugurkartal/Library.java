package net.ugurkartal;

import java.util.Arrays;

public class Library {
    public Book[] books;

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook (Book... books){
        this.books = books;
        String booktitles = "";
        for (Book book : books){
            if (booktitles == ""){
                booktitles = book.getTitle();
            }else {
                booktitles = booktitles + ", " + book.getTitle();
            }

        }
        System.out.println("added " + booktitles);
    }

    public void deleteBook (Book book){
        int index = 0;
        Book[] newBooks = new Book[this.books.length-1];
        for (Book searchBook : this.books){
            if (searchBook != book){
                newBooks[index] = searchBook;
                index++;
            }
        }
        this.books = newBooks;
        System.out.println("deleted " + book.getTitle());
    }
}