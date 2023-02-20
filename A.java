import java.util.Scanner;


class A {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String items;
        int i;
        String[] perishableitem = new String[5];
        String[] nonperishableitem = new String[5];
        int price[] = new int[5];
        int qua[] = new int[5];
        int exp[] = new int[5];


    // Loop through each item to input details
    for (i = 0; i <= 2; i++) {
        System.out.print("Enter element: ");
        perishableitem[i] = sc.nextLine();
    }
    for (i = 0; i <= 2; i++) {
        System.out.print("Price: ");
        price[i] = sc.nextInt();
    }
    for (i = 0; i <= 2; i++) {
        System.out.print("Quantity of item: ");
        qua[i] = sc.nextInt();
    }
    for (i = 0; i <= 2; i++) {
        System.out.print("Expiry date: ");
        exp[i] = sc.nextInt();
    }

    // Output the details
    for (i = 0; i <= 2; i++) {
        System.out.print("------------------------------------------------------------");
        System.out.println("Items are: " + perishableitem[i]);
        System.out.println("Quantity: " + qua[i]);
        System.out.println("Price: " + price[i]);
        System.out.println("Expiry data: " + exp[i]);
    }

    // Determine the action to take depending on the expiry date
    for (i = 0; i <= 2; i++) {
        if ((exp[i] >= 10) && (exp[i] <= 15)) {
            System.out.print("Sell early");
        } else {
            System.out.print("Store");
        }
    }
}
}