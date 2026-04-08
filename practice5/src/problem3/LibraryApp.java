package problem3;

import java.io.*;
import java.util.*;

public class LibraryApp {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("library.dat"))) {
            books = (ArrayList<Book>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No previous data.");
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("A - Add, L - List, Q - Quit");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("A")) {
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();

                books.add(new Book(title, author));

            } else if (choice.equalsIgnoreCase("L")) {
                for (Book b : books) {
                    System.out.println(b);
                }

            } else if (choice.equalsIgnoreCase("Q")) {
                break;
            }
        }

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("Error saving data");
        }

        sc.close();
    }
}