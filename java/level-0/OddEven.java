import java.util.Scanner;

public class OddEven {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven() {
        System.out.println("Input a number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
