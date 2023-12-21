package technology;

public class Program {
    public static void main(String[] args) {
        Laptop macBook = new Laptop(512, "Apple M3 Pro chip", "macOS", "Apple", "MacBook Pro");
        System.out.println(macBook.getOperatingSystem());
        System.out.println(macBook.getId());

        Laptop macBook2 = new Laptop(512, "Apple M3 Pro chip", "macOS", "Apple", "MacBook Pro");
        System.out.println(macBook2.getId());;
    }
}
