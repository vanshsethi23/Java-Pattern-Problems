public class DecreasingCharacterTrianglePattern {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1, p = 'E'; i <= n; i++, p--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p + " ");
            }
            System.out.println();
        }
    }
}