import java.util.Scanner;

public class thirty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correct = sc.nextInt();
        int answer = sc.nextInt();

        if ((correct == 1 && answer == 1) ||
                (correct != 1 && answer != 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}