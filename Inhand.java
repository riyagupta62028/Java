import java.util.Scanner;

public class Inhand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 int[] newproduct = new int[5]; 
        int[] minStock = new int[5];
        int[] maxStock = new int[5];
        int[] currentStock = new int[5];
           int[] supply = new int[5];
        
        
        System.out.println("Enter minimum stock levels for each product:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Product " + (i+1) + ": ");
            minStock[i] = scan.nextInt();
        }
        
        // Input maximum stock levels for each product
        System.out.println("Enter maximum stock levels for each product:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Product " + (i+1) + ": ");
            maxStock[i] = scan.nextInt();
        }
       System.out.println("Enter supply each product:");
       
        for (int i = 0; i < 5; i++) {
            System.out.print("Product " + (i+1) + ": ");
           supply[i] = scan.nextInt();
}
        
        // Input current stock levels for each product
        System.out.println("Enter current stock levels for each product:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Product " + (i+1) + ": ");
            currentStock[i] = scan.nextInt();
        }
        
        // Check if current stock levels are within minimum and maximum limits
        for (int i = 0; i < 5; i++) {
            if (currentStock[i] < minStock[i]) {
                System.out.println("Product " + (i+1) + " is below minimum stock level. Minimum: ");
            } else if (currentStock[i] > maxStock[i]) {
                System.out.println("Product " + (i+1) +  " is above maximum stock level. Maximum:" + supply[i]  );
            } else {
                System.out.println("Product " + (i+1) + " stock level is within limits. Minimum:" );
            }
               newproduct[i]  = (supply[i] + currentStock[i]);
                System.out.println("new quality product :" +  newproduct[i]  );

}
        for (int i = 0; i < 5; i++)
{
       if (newproduct[i]>= minStock[i] && newproduct[i] <= maxStock[i] ) {
            System.out.println("Product  supply accepted");
        } else {
            System.out.println("Product supply rejected");
        }

} 
 
}
}

    