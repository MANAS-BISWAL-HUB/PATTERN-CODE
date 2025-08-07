
/*WAP to display pattern 
 12345
 1234
 123
 12
 1
*/
import java.util.Scanner;

class pat35 {
    public static void main(String[] args) {
        int n, i, j;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no:");
        n = S.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}