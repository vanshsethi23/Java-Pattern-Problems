public class KShape_NumberPatternProgram {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
}
