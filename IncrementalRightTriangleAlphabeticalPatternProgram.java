public class IncrementalRightTriangleAlphabeticalPatternProgram {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 1; i <= n; i++) {
            int p = 'A';
            for(int j = 1; j <= i; j++) {
                System.out.print((char)p++ + " ");
            }
            System.out.println();
        }
    }
}
