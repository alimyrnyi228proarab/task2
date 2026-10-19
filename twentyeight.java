import java.util.Scanner;

public class twentyeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (x >= values[i]) {
                result.append(romans[i]);
                x -= values[i];
            }
        }

        System.out.println(result);
    }
}