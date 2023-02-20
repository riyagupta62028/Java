
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String perishable_item[] = new String[5];
        String nonperishable_item[] = new String[5];
        int price[] = new int[10];
        int qua[] = new int[10];
        int exp[] = new int[10];

        // Loop through each item to input details
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter perishable item: ");
            perishable_item[i] = sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter nonperishable item: ");
            nonperishable_item[i] = sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Price: ");
            price[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Quantity of item: ");
            qua[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Expiry date: ");
            exp[i] = sc.nextInt();
        }

        // Output the details
        for (int i = 0; i < 10; i++) {
            System.out.print("------------------------------------------------------------");
            if (i < 5) {
                System.out.println("Items are: " + perishable_item[i]);
            } else {
                System.out.println("Items are: " + nonperishable_item[i - 5]);
            }
            System.out.println("Quantity: " + qua[i]);
            System.out.println("Price: " + price[i]);
            System.out.println("Expiry data: " + exp[i]);

}}}}}