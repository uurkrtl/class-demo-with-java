package net.ugurkartal;

import java.util.Arrays;

public class Library {
    public Book[] books = new Book[0];

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook (Book... books){
        int length = this.books == null ? 0: this.books.length;
        Book[] newBooks = new Book[books.length + this.books.length];
        int index = 0;
        for (Book searchBook : this.books){
            newBooks[index] = searchBook;
            index++;
        }

        for (Book searchBook : books){
            newBooks[index] = searchBook;
            index++;
        }

        this.books = newBooks;
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