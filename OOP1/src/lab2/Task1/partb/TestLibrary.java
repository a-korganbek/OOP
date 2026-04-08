package lab2.Task1.partb;
public class TestLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997, 500);
        Book book2 = new Book("1984", "George Orwell", 1949, 328);

        System.out.println(book1);
        System.out.println(book2);
    }
}