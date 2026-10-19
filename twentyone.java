import java.util.Scanner;
import java.util.Arrays;

public class twentyone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("impossible");
            return;
        }

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        int x = sides[0];
        int y = sides[1];
        int z = sides[2];

        if (x * x + y * y == z * z) {
            System.out.println("right");
        } else if (x * x + y * y > z * z) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}