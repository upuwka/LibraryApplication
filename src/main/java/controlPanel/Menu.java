package controlPanel;
import entityPanel.Reader;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Reader newReader = new Reader();
    Registration registration = new Registration();
    Library library = new Library();

     public void showMenu() {

        String[] userMenu = {"Add new Reader", "Show All Readers", "Join the Library", "Exit the program"};
        ImageIcon icon = new ImageIcon("menu.jpg");
        String option = (String) JOptionPane.showInputDialog(
                null,
                "Please choose:",
                "Welcome to our Library!",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                userMenu,
                userMenu[0]
        );
        if (option == userMenu[0]) {
            addReader();
            showMenu();
        } else if (option == userMenu[1]) {
            viewAllReaders();
            showMenu();
        } else if (option == userMenu[2]) {
            joinLibrary();
            showMenu();
        } else {
            System.exit(0);
        }
    }

     public void addReader() {
        System.out.print("\nEnter Your Name: ");
        newReader.setName(scanner.nextLine());

        System.out.print("Enter Your email: ");
        newReader.setEmail(scanner.nextLine());

        System.out.print(registration.addReader(newReader) + " Welcome!");
       showMenu();
        }

     public void viewAllReaders(){
            ArrayList<Reader> allReaders = registration.getAllReaders();
            System.out.println("\nList of Readers");
                int counter = 1;
                for (Reader reader : allReaders) {
                    System.out.println(counter + ". " + reader.getName() + " " + reader.getEmail());
                    counter++;
                }
        }

     public void joinLibrary(){
             library.showLibMenu();
         }

}
