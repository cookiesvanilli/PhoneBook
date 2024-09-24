import org.junit.Test;
import ru.netology.PhoneBook;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void add() {
        final String name = "Maria";
        final long number = 9731231223L;
        final int original = 1;
        final int result = PhoneBook.add(name, number);
        assertEquals(original, result);
    }
}
