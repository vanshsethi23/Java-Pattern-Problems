public class PyramidalNumberPatternProgram {
    public static void main(String[] args) {
        int n = 9;
        // Loop for each row
        for (int i = 1; i <= n; i++) {

            // Print spaces for formatting
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in decreasing order on the left side
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            // Print numbers in increasing order on the right side
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}

