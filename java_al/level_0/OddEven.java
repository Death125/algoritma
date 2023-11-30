package java_al.level_0;

/*
 * Guess the odd or even number
 */
import java.util.Scanner;

public class OddEven {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        guessOddOrEvenNumber();
    }

    public static void guessOddOrEvenNumber() {
        System.out.println("Input a number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        sc.close();
    }
}
