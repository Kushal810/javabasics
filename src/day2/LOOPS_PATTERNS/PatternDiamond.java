package day2.LOOPS_PATTERNS;

public class PatternDiamond {
    public static void main(String[] args) {

        int rows = 5;

        // Upper half
        for (int i = 1; i <= rows; i++) {

            // Spaces
            for (int s = 1; s <= rows - i; s++)
                System.out.print(" ");

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {

            // Spaces
            for (int s = 1; s <= rows - i; s++)
                System.out.print(" ");

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
