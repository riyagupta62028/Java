
import java.util.Scanner;
 
public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String perishable_item[] = new String[10];
        String nonperishable_item[] = new String[10];
        int perishable_expiry[] = new int[10];
        int nonperishable_expiry[] = new int[10];
 
        // Take input from user
        System.out.println("Enter the names of 5 perishable and 5 non-perishable items:");
        for(int i=0; i<10; i++){
            if(i < 5)
                perishable_item[i] = sc.next();
            else
                nonperishable_item[i-5] = sc.next();
        }
 
        // Take expiration date of each item
        System.out.println("Enter the expiration date of each item in days:");
        for(int i=0; i<10; i++){
            if(i < 5)
                perishable_expiry[i] = sc.nextInt();
            else
                nonperishable_expiry[i-5] = sc.nextInt();
        }
 
        
        for(int i=0; i<10; i++){
            if(i < 5 && perishable_expiry[i] <= 10)
                System.out.println("Perishable item early for cell " + perishable_item[i] );
            else if(i >= 5 && nonperishable_expiry[i-5] <= 365)
                System.out.println("Non-perishable item early for cell " + nonperishable_item[i-5] );
                else 
                {
                     System.out.println(" item store for cell ");
                }
        }
 }
       }