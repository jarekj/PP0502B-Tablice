import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // https://pl.spoj.com/problems/PP0502B/
        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();
            int[] intArray = new int[n];
            for (int i = 0; i < n; ++i) {
                intArray[i] = scanner.nextInt();
            }

            for (int i = n -1; i >=0; --i) {
                System.out.print(intArray[i]+ " ");
            }
            System.out.println();
            t--;
        }
    }
}
