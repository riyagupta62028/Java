import java.util.Scanner;

public class First {
   int NUM_PRODUCTS = 5;

  public static void main(String[] args) {
    int[] minQuantity = new int[NUM_PRODUCTS];
    int[] maxQuantity = new int[NUM_PRODUCTS];
    int[] quantityInHand = new int[NUM_PRODUCTS];
    Scanner sc = new Scanner(System.in);

    // Read the minimum quantity for each product
    for (int i = 0; i < NUM_PRODUCTS; i++) {
      System.out.print("Enter minimum quantity for product "  + ": ");
      minQuantity[i] = sc.nextInt();
    }

    // Read the maximum quantity for each product
    for (int i = 0; i < NUM_PRODUCTS; i++) {
      System.out.print("Enter maximum quantity for product " + (i + 1) + ": ");
      maxQuantity[i] = sc.nextInt();
    }

    // Read the quantity in hand for each product
    for (int i = 0; i < NUM_PRODUCTS; i++) {
      System.out.print("Enter quantity in hand for product " + (i + 1) + ": ");
      quantityInHand[i] = sc.nextInt();

      // Check if the quantity in hand is within the allowed range
      if (quantityInHand[i] < minQuantity[i])
     {
        System.out.println("not in range" );
     }
          else if( quantityInHand[i] > maxQuantity[i]) 
        {
        System.out.println("messgae Quantity in hand for product " + (i + 1) + " is outside the allowed range");
      }
    }
  }}
