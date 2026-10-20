import java.util.Scanner;

public class RecursionDemo {
    private static final Scanner scanner = new Scanner(System.in);

    private static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        System.out.print("Number: ");
        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }
}