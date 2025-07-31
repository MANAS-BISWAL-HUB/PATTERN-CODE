
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n, i, j;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no:");
        n = S.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(" *");
            }
        }
        System.out.println();

    }
}
