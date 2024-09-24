import org.junit.Test;
import ru.netology.PhoneBook;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void addTest() {
        final String name = "Maria";
        final long number = 9731231223L;
        final int original = 1;
        final int result = PhoneBook.add(name, number);
        assertEquals(original, result);
    }

    @Test
    public void testFindByNumber() {
        final String original = "Jorge";
        final long number = 9999999999L;
        PhoneBook.phonebook.put("Jorge", 9999999999L);
        final String result = PhoneBook.findByNumber(number);
        assertEquals(original, result);

    }
}
