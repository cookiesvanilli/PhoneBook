import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import ru.netology.PhoneBook;


import static org.junit.Assert.assertEquals;

public class PhoneBookTest {

    @Test
    public void add() {
        System.out.println("ADD");
        final String name = "Maria";
        final long number = 9876543210L;
        final int original = PhoneBook.phonebook.size();
        final int result = PhoneBook.add(name, number);
        System.out.println(PhoneBook.phonebook.size());
        assertEquals(original + 1, result);
    }

    @Test
    public void testFindByNumber() {
        System.out.println("FINDNUMBER");
        final String original = "Ivan";
        final long number = 9999999999L;
        PhoneBook.phonebook.put("Ivan", 9999999999L);
        final String result = PhoneBook.findByNumber(number);
        assertEquals(original, result);

    }

    @Test
    public void testFindByName() {
        System.out.println("FINDNAME");
        PhoneBook.phonebook.put("Ivan", 9999999999L);
        final String name = "Ivan";
        final long original = 9999999999L;
        final long result = PhoneBook.findByName(name);
        assertEquals(original, result);

    }

}
