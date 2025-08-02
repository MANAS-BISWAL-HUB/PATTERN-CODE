import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int n, i, j;
        Scanner S = new Scanner(System.in);
        System.out.println("enter no:");
        n = S.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
