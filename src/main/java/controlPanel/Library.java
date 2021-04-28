package controlPanel;

import entityPanel.Book;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    BookCatalog catalog = new BookCatalog();
    Scanner scanner = new Scanner(System.in);
    Book book = new Book();
    private ArrayList<BookCatalog> books = new ArrayList<>();

    public void showLibMenu() {

        String[] userMenu = {"Add new Book", "Show All Books", "Find a Book", "Take out A Book", "Return a Book", "Delete a Book", "Exit the program"};
        ImageIcon icon = new ImageIcon("books.jpg");
        String option = (String) JOptionPane.showInputDialog(
                null,
                "Please choose:",
                "Welcome yo our Library!",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                userMenu,
                userMenu[0]
        );
        if (option == userMenu[0]) {
            addNewBook();
            showLibMenu();
        } else if (option == userMenu[1]) {
            viewAllBooks();
            showLibMenu();
        } /*else if (option == userMenu[2]) {
            findBook();
            showLibMenu();
        } else if (option == userMenu[3]) {
            takeOutBook();
            showLibMenu();
        } else if (option == userMenu[4]) {
            returnBook();
            showLibMenu();
        } else if (option == userMenu[5]) {
            removeBook();
            showLibMenu();
        } */else {
            System.exit(0);
        }
    }

    public void addNewBook() {

        System.out.print("Enter Book Author: ");
        String author  = scanner.nextLine();

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Year of Publish: ");
        int yearOfPublish = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Book genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter No. of pisces: ");
        int i = Integer.parseInt(scanner.nextLine());

        Book book = new Book( author,  title,  yearOfPublish, genre,  i);
        System.out.println(catalog.addBook(book) + "\n");
        showLibMenu();
        }

    public void viewAllBooks(){

        ArrayList<Book> allCatalog = catalog.getAllCatalog();

        System.out.println("\nAll Library Books:\n");
        System.out.printf("%-4s %-15s %-15s %-15s %-9s %-9s %n","No", "Book Author", "Book title", "Published", "Genre", "Quantity\n");

        int counter = 1;
        for (Book book: allCatalog) {
            System.out.println(counter + "  " + book.getAuthor() + "  " + book.getTitle() + "  "+ book.getYearOfPublish() + "  "+ book.getGenre() + "  "+ book.getQuantity());
            counter++;
        }
}

    public void removeBook( ) { }
    public void findBook( ) { }
    public void takeOutBook(){ }
    public void returnBook(){ }

}
