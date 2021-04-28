package controlPanel;
import entityPanel.Book;

import java.util.ArrayList;

public class BookCatalog {
    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getAllCatalog(){
        books.add(new Book("J. K. Rowling", "Philosopher's Stone", 1997, "fantasy", 10 ));
        books.add(new Book("J. K. Rowling", "Chamber of Secrets", 1998, "fantasy", 9 ));
        books.add(new Book("J. K. Rowling", "Prisoner of Azkaban", 1999, "fantasy", 10 ));
        books.add(new Book("J. K. Rowling", "Goblet of Fire", 2000, "fantasy", 11 ));
        books.add(new Book("J. K. Rowling", "Order of the Phoenix", 2003, "fantasy", 5 ));
        books.add(new Book("J. K. Rowling", "Half-Blood Prince", 2005, "fantasy", 2 ));
        books.add(new Book("J. K. Rowling", "Deathly Hallows", 2007, "fantasy", 6 ));
        books.add(new Book("Agatha Christie", "Murder on the Orient Express", 1934, "detective", 15 ));
        books.add(new Book("Agatha Christie", "The Boomerang Clue", 1935, "detective", 15 ));
        books.add(new Book("Agatha Christie", "The A.B.C. Murders", 1936, "detective", 8 ));
        books.add(new Book("Agatha Christie", "Murder in Three Acts", 1935, "detective", 3 ));
        return books;
    }
    public String addBook(Book newBook) {
        books.add(newBook);
        return "\nBook " + newBook.getTitle() + " created successfully";

    }
}
