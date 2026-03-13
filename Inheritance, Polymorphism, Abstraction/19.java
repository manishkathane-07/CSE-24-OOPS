/*
A library wants to store details of multiple books.
Question:
Create a class Book with attributes:
1. title
2. author
3. price
Create an array of Book objects and display the details of all books.
*/

class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {

        Book books[] = {
            new Book("Java","James",500),
            new Book("C","Dennis",400),
            new Book("Python","Guido",600)
        };

        for(Book b : books) {
            b.display();
        }
    }
}