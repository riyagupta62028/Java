import java.util.Date;

public class CellStore {
   int NUM_PERISHABLE_ITEMS = 5;
   int NUM_NON_PERISHABLE_ITEMS = 5;

  public static void main(String[] args) {
    Item[] perishableItems = new Item[NUM_PERISHABLE_ITEMS];
    Item[] nonPerishableItems = new Item[NUM_NON_PERISHABLE_ITEMS];

   
    for (int i = 0; i < NUM_PERISHABLE_ITEMS; i++) {
      perishableItems[i] = new Item("Perishable " + (i + 1), new Date(), true);
    }

    // Initialize non-perishable items with their respective product category and expiry date
    for (int i = 0; i < NUM_NON_PERISHABLE_ITEMS; i++) {
      nonPerishableItems[i] = new Item("Non-Perishable " + (i + 1), null, false);
    }

    // Sort the perishable items based on their expiry date
    sortByExpiryDate(perishableItems);

    // Sell the perishable items with the nearest expiry date first
    for (Item item : perishableItems) {
      if (item.isPerishable() && !item.isSold()) {
        System.out.println("Selling " + item.getProductCategory());
        item.setSold(true);
      }
    }

    // Sell the non-perishable items based on demand and stock levels
    for (Item item : nonPerishableItems) {
      if (!item.isPerishable() && !item.isSold()) {
        System.out.println("Selling " + item.getProductCategory());
        item.setSold(true);
      }
    }
  }

  private static void sortByExpiryDate(Item[] items) {
    // Implement sorting algorithm to sort the items based on their expiry date
  }
}

class Item {
  private String productCategory;
  private Date expiryDate;
  private boolean isPerishable;
  private boolean isSold;

  public Item(String productCategory, Date expiryDate, boolean isPerishable) {
    this.productCategory = productCategory;
    this.expiryDate = expiryDate;
    this.isPerishable = isPerishable;
    this.isSold = false;
  }

  public String getProductCategory() {
    return productCategory;
  }

  public Date getExpiryDate() {
    return expiryDate;
  }

  public boolean isPerishable() {
    return isPerishable;
  }

  public boolean isSold() {
    return isSold;
  }

  public void setSold(boolean sold) {
    isSold = sold;
  }
}