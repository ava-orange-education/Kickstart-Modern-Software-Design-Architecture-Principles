import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitExample {
    
    @Test
    public void testAddition() {
        int result = Calculator.add(3, 4);
        assertEquals(7, result);
    }
}

class Calculator {
    
    public static int add(int a, int b) {
        return a + b;
    }
}

