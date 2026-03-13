/* 

Design a Book class (title, author, ISBN) and a Library class that manages a
collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
add a new book, remove a book by ISBN, and display all available books

*/

import java.util.*;

class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void display() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("C Programming", "Dennis", "102"));

        lib.display();
    }
}