public class FactorialCalculator {
 
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 8; 
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
