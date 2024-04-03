import java.util.Scanner;

public class StarSandGlassPattern {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the number of rows for the sandglass pattern
        System.out.print("Enter the number of rows you want to print: ");
        n = sc.nextInt();

        // Upper half of the sandglass
        for (i = 1; i <= n; i++) {
            // Print leading spaces
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (k = i; k <= n; k++) {
                System.out.print("*" + " ");
            }

            // Move to the next line
            System.out.println("");
        }

        // Lower half of the sandglass
        for (i = n; i >= 1; i--) {
            // Print leading spaces
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (k = i; k <= n; k++) {
                System.out.print("*" + " ");
            }

            // Move to the next line
            System.out.println("");
        }

        // Close the scanner
        sc.close();
    }
}
