import java.util.Scanner;

public class welth_osQuiz {
    public static int findNthNumber(int n) {
        // Define the first four numbers in the series
        int a = 1, b = 2, c = 3, d = 4;

        // If n is less than or equal to 4, return the corresponding value
        if (n == 1) return a;
        if (n == 2) return b;
        if (n == 3) return c;
        if (n == 4) return d;

        // Calculate subsequent numbers up to the nth number
        int next = 0;
        for (int i = 5; i <= n; i++) {
            next = a + b + c + d; // Sum of the previous four numbers
            a = b; // Shift the window
            b = c;
            c = d;
            d = next;
        }

        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = findNthNumber(n);
        System.out.println(result);
    }
}
