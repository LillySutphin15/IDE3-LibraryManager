import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager{
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        Scanner scnr = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nLibraryManager");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Magazine");
            System.out.println("3. Add a DVD");
            System.out.println("4. Display all items");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scnr.nextInt();
            scnr.nextLine();

            switch (choice) {
                case 1:
                    //adds a book
                    System.out.println("Enter the title: ");
                    String bookTitle = scnr.nextLine();
                    System.out.println("Enter the author: ");
                    String bookAuthor = scnr.nextLine();
                    System.out.println("Enter the year published: ");
                    int bookYear = scnr.nextInt();
                    System.out.println("Enter the item ID: ");
                    int bookID = scnr.nextInt();
                    System.out.println("Enter the number of pages: ");
                    int numPages = scnr.nextInt();
                    scnr.nextLine();

                    Book book = new Book(bookTitle, bookAuthor, bookYear, bookID, numPages);
                    libraryItems.add(book);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    //add a magazine
                    System.out.println("Enter the title: ");
                    String magTitle = scnr.nextLine();
                    System.out.println("Enter the author: ");
                    String magAuthor = scnr.nextLine();
                    System.out.println("Enter the year published: ");
                    int magYear = scnr.nextInt();
                    System.out.println("Enter the item ID: ");
                    int magID = scnr.nextInt();
                    scnr.nextLine();
                    System.out.println("Enter the issue Frequency (e.g., Monthly, Weekly): ");
                    String issueFrequency = scnr.nextLine();

                    Magazine magazine = new Magazine(magTitle, magAuthor, magYear, magID, issueFrequency);
                    libraryItems.add(magazine);
                    System.out.println("Magazine added successfully!");
                    break;

                case 3:
                    //add a DVD
                    System.out.println("Enter the title: ");
                    String dvdTitle = scnr.nextLine();
                    System.out.println("Enter the author: ");
                    String dvdAuthor = scnr.nextLine();
                    System.out.println("Enter the year published: ");
                    int dvdYear = scnr.nextInt();
                    System.out.println("Enter the item ID: ");
                    int dvdID = scnr.nextInt();
                    System.out.println("Enter the duration (in minutes): ");
                    int duration = scnr.nextInt();
                    scnr.nextLine();

                    DVD dvd = new DVD(dvdTitle, dvdAuthor, dvdYear, dvdID, duration);
                    libraryItems.add(dvd);
                    System.out.println("DVD added successfully!");
                    break;

                case 4:
                    //display all items
                    if (libraryItems.isEmpty()) {
                        System.out.println("No items in library.");
                    } else {
                        for (LibraryItem item : libraryItems) {
                            item.displayInfo();
                            System.out.println(); //adds a blank line between items
                        }
                    }
                    break;

                case 5:
                    //Exit
                    System.out.println("Exiting the program. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }while (choice != 5);

        scnr.close();


        }
}