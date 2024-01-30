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
        Book[] newBooks = new Book[books.length + this.books.length];
        int index = 0;

        //Add existing books to new array (newBooks)
        for (Book searchBook : this.books){
            newBooks[index] = searchBook;
            index++;
        }

        //Add new books to new array (newBooks)
        for (Book searchBook : books){
            newBooks[index] = searchBook;
            index++;
        }

        this.books = newBooks;

        // Get book titles for printing
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

        //Add existing books to new array (newBooks)
        for (Book searchBook : this.books){
            if (searchBook != book){ //Don't add deleted book
                newBooks[index] = searchBook;
                index++;
            }
        }
        this.books = newBooks;
        System.out.println("deleted " + book.getTitle());
    }
}