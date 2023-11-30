import java.util.Scanner;

public class VariableExchange {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        variableExchange1();
        variableExchange2();
    }

    public static void variableExchange1() {
        String favouriteDrink1 = "Milk";
        String favouriteDrink2 = "Juice";
        String favouriteDrinkTemp = "";

        System.out.println("Drink Favourite 1 Before : " + favouriteDrink1);
        System.out.println("Drink Favourite 2 Before : " + favouriteDrink2);

        favouriteDrinkTemp = favouriteDrink1;
        favouriteDrink1 = favouriteDrink2;
        favouriteDrink2 = favouriteDrinkTemp;

        System.out.println("Drink Favourite 1 After : " + favouriteDrink1);
        System.out.println("Drink Favourite 2 After : " + favouriteDrink2);
    }

    public static void variableExchange2() {
        // Just For Numeric
        int a = 25;
        int b = 39;

        System.out.println("Value of a before : " + a);
        System.out.println("Value of b before : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a after : " + a);
        System.out.println("Value of b after : " + b);
    }
}
