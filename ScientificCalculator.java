import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

interface ScientificCalculatorService {
    double xToThePowerY(double input1, double input2);
}

class MathOperation {
    private final ScientificCalculatorService calculatorService;

    public MathOperation(ScientificCalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double xToThePowerY(double input1, double input2) {
        return calculatorService.xToThePowerY(input1, input2);
    }
}

class MathApplicationTest {

    @Test
    public void testXToThePowerY() {
        // Create a mock ScientificCalculatorService
        ScientificCalculatorService calculatorServiceMock = Mockito.mock(ScientificCalculatorService.class);
        when(calculatorServiceMock.xToThePowerY(anyDouble(), anyDouble())).thenReturn(8.0); // Set a mock result

        // Create a MathOperation instance with the mock service
        MathOperation mathOperation = new MathOperation(calculatorServiceMock);

        // Calculate x^y (using mock result 8.0)
        double result = mathOperation.xToThePowerY(2.0, 3.0);

        // Verify that the mock service method was called with the correct arguments
        verify(calculatorServiceMock).xToThePowerY(2.0, 3.0);

        // Assert the result
        assertEquals(8.0, result, 0.001);
    }

    public static void main(String[] args) {
        // Example usage
        ScientificCalculatorService calculatorService = (input1, input2) -> Math.pow(input1, input2);
        MathOperation mathOperation = new MathOperation(calculatorService);

        double base = 2.0;
        double exponent = 3.0;
        double result = mathOperation.xToThePowerY(base, exponent);

        System.out.println(base + " ^ " + exponent + " = " + result);
    }
}
