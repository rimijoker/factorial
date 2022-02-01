import org.junit.jupiter.api.Test;

public class FactorialTests {

    @Test
    void factorialOfNegativeNumber() {
        int actual = Factorial.getFactorial(-2);
        int expected = -1;
        assert actual == expected;
    }

    @Test
    void factorialOfZero() {
        int actual = Factorial.getFactorial(0);
        int expected = 1;
        assert actual == expected;
    }

    @Test
    void factorialOfPositiveNumber() {
        int actual = Factorial.getFactorial(5);
        int expected = 120;
        assert actual == expected;
    }
}
