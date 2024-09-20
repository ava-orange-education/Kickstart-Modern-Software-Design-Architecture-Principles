public class Calculator {
    
    /**
    * Name: Calculator class 
    * Last update: 2/11/2024
    * Purpose: provides basic arithmetic operations.
    */

    /**
     * Adds two numbers.
     *
     * @param x The first number.
     * @param y The second number.
     * @return The sum of x and y.
     */
    public int add(int x, int y) {
        return x + y;
    }

    /**
     * Subtracts one number from another.
     *
     * @param x The number to subtract from.
     * @param y The number to subtract.
     * @return The result of subtracting y from x.
     */
    public int subtract(int x, int y) {
        return x - y;
    }

    /**
     * Main method to execute the Calculator class.
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(300, 19);
        int result2 = calculator.subtract(2024, 2008);
        System.out.println("Addition result: " + result1);
        System.out.println("Subtraction result: " + result2);
    }
}

