import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import technology.Computer;
import technology.Laptop;

import static org.junit.jupiter.api.Assertions.*;
public class Tests {
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testComputerName(){
        Computer name = new Computer(512, "Apple M3 Pro chip", "macOS");
        assertEquals("Apple M3 Pro chip", name.getName());
    }

    @Test
    public void testId(){
        Laptop macBook = new Laptop(512, "Apple M3 Pro chip", "macOS", "Apple", "MacBook Pro");
        Laptop macBook2 = new Laptop(512, "Apple M3 Pro chip", "macOS", "Apple", "MacBook Pro");
        assertNotEquals(macBook2.getId(), macBook.getId());

    }
}
