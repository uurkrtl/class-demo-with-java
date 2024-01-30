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
}
