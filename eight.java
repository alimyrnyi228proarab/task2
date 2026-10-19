import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0 || (-b) % a != 0) {
            System.out.println("NO");
        } else {
            System.out.println(-b / a);
        }
    }
}