public class CalculatorTest {

    public static void main(String[] args) {

        int result = Calculator.add(10, 5);

        if (result != 15) {
            throw new RuntimeException(
                "Test failed: Expected 15 but got " + result
            );
        }

        System.out.println("All tests passed!");
    }
}