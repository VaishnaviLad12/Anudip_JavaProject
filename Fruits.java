import java.util.Collections;
import java.util.List;

public class ListUtils {
    public static <T extends Comparable<? super T>> T findMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return Collections.max(list);
    }

    public static <T> List<T> reverse(List<T> list) {
        Collections.reverse(list);
        return list;
    }

    public static <T> boolean containsElement(List<T> list, T element) {
        return list.contains(element);
    }
}
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListUtilsTest {

    @Test
    void testFindMax() {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 15, 3);
        assertEquals(15, ListUtils.findMax(numbers));
    }

    @Test
    void testFindMaxEmptyList() {
        List<Integer> emptyList = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> ListUtils.findMax(emptyList));
    }

    @Test
    void testReverse() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> reversed = ListUtils.reverse(words);
        assertEquals(Arrays.asList("cherry", "banana", "apple"), reversed);
    }

    @Test
    void testContainsElement() {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        assertTrue(ListUtils.containsElement(fruits, "banana"));
        assertFalse(ListUtils.containsElement(fruits, "grape"));
    }
}
