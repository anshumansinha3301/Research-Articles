public class MultiplicationExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! You are trying to access an invalid array index.");
        }
    }
}
