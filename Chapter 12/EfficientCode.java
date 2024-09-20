import java.util.Arrays;

public class EfficientCode {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        System.out.println("Sum: " + sum);
    }

    public static int sumArray(int[] array) {
        return Arrays.stream(array).sum();
    }

    public static int findMax(int[] array) {
        return Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}

