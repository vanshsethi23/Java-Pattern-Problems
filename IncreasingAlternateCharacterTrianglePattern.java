public class IncreasingAlternateCharacterTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1, p = 'A'; i <= n; i++, p += 2) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("B ");
                } else {
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
    }
}
