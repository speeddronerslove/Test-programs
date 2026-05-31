import java.util.Scanner;
import java.util.ArrayList;

 class Book {
    String name ;
    String author ;
    boolean isavailable;

    Book (String name , String author) {
        this.name = name ;
        this.author = author;
        this.isavailable = true;
    }
 }

public class Librarysystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Book> books = new ArrayList<>();

        while (true){

            System.out.println("\n----------- LIBRARY MANAGEMENT SYSTEM ------------");
            System.out.println("Enter any choice ");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Search Books");
            System.out.println("5. Show Books");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                     System.out.println("Enter the Book title = ");
                     String title = sc.nextLine();
                     System.out.println("Enter the Author name = ");
                     String author = sc.nextLine();
                     books.add(new Book(title, author));
                     System.out.println("Book added successfully");
            }
        }
        
    }
    
}