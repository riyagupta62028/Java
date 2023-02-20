public class Y {
  public static void main(String[] args) {
    int[] minQuantity = {10, 20, 5, 15, 25};
    int[] maxQuantity = {100, 50, 30, 40, 60};
    int[] inHand = {15, 25, 10, 20, 30};

    for (int i = 0; i < 5; i++) {
      if (inHand[i] < minQuantity[i]) {
        System.out.println("Product " + (i + 1) + " is below minimum, reorder needed");
      } else if (inHand[i] > maxQuantity[i]) {
        System.out.println("Product " + (i + 1) + " is above maximum, surplus inventory");
      } else {
        System.out.println("Product " + (i + 1) + " is within range");
      }
    }
  }
}