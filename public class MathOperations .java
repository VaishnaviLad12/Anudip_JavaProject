public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

    private final MathOperations mathOps = new MathOperations();

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5", // 2 + 3 = 5
            "10, 5, 5", // 10 - 5 = 5
            "4, 6, 24", // 4 * 6 = 24
            "10, 2, 5.0" // 10 / 2 = 5.0
    })
    void testArithmeticOperations(int a, int b, double expected) {
        assertEquals(expected, mathOps.add(a, b));
        assertEquals(expected, mathOps.subtract(a, b));
        assertEquals(expected, mathOps.multiply(a, b));
        assertEquals(expected, mathOps.divide(a, b), 0.0001); // Delta for double comparison
    }
}
