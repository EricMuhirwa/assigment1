import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pizza> pizzaList = new ArrayList<>();
        int numPizzas;
        while (true) {
            System.out.print("Enter the number of pizzas to order: ");
            if (scanner.hasNextInt()) {
                numPizzas = scanner.nextInt();
                if (numPizzas > 0) break;
            }
            scanner.nextLine();
            System.out.println("Invalid input! Please enter a positive integer.");
        }
        scanner.nextLine();

        for (int i = 0; i < numPizzas; i++) {
            System.out.println("\nOrdering Pizza " + (i + 1));


            int slices;
            while (true) {
                System.out.print("Enter number of slices: ");
                if (scanner.hasNextInt()) {
                    slices = scanner.nextInt();
                    if (slices > 0) break;
                }
                scanner.nextLine(); // Consume invalid input
                System.out.println("Invalid input! Please enter a positive integer.");
            }
            scanner.nextLine();

            MeatChoice meatChoice = null;
            while (true) {
                System.out.println("Choose a meat: \n1. BEEF \n2. POG \n3. CHICKEN");
                if (scanner.hasNextInt()) {
                    int meatInput = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (meatInput >= 1 && meatInput <= 3) {
                        meatChoice = MeatChoice.values()[meatInput - 1];
                        break;
                    }
                }
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
            }


            VegChoice vegChoice = null;
            while (true) {
                System.out.println("Choose a vegetable: \n1. TOMATO \n2. SPINACH \n3. CARROT \n4. GARBAGE \n5. SPINACH");
                if (scanner.hasNextInt()) {
                    int vegInput = scanner.nextInt();
                    scanner.nextLine();
                    if (vegInput >= 1 && vegInput <= 5) {
                        vegChoice = VegChoice.values()[vegInput - 1];
                        break;
                    }
                }
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

            Pizza orderedPizza = new Pizza(slices, meatChoice, vegChoice);
            pizzaList.add(orderedPizza);
            System.out.println("Pizza ordered: " + orderedPizza);
        }


        System.out.println("\n=========== The Following Pizzas is Ordered ==========");
        for (Pizza pizza : pizzaList) {
            System.out.println("You order: " + pizza);
        }

        scanner.close();
    }
}
