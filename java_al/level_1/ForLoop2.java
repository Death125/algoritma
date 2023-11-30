package java_al.level_1;

import java.util.Scanner;

public class ForLoop2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        forLoop();
    }

    public static void forLoop() {
        System.out.println("Input the number of rows : ");
        int n = sc.nextInt();
        int temp = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(j + 1);
                if ((j + 1) == temp) {
                    if (n % 2 == 0) {
                        System.out.print("**");
                        for (int k = temp + 3; k <= n + 3; k++) {
                            System.out.print(k);
                        }
                    } else {
                        System.out.print("^^");
                        for (int k = temp + 3; k <= n + 3; k++) {
                            System.out.print(k);
                        }
                    }
                }
            }

            temp--;
            System.out.println("");
        }

        sc.close();
    }
}
