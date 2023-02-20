import java.util.Scanner;
public class ProductSupply {
    private static final int MIN_QTY_PRD_1 = 10;
    private static final int MIN_QTY_PRD_2 = 20;
    private static final int MIN_QTY_PRD_3 = 30;
    private static final int MIN_QTY_PRD_4 = 40;
    private static final int MIN_QTY_PRD_5 = 50;
    private static final int MAX_QTY_PRD_1 = 100;
    private static final int MAX_QTY_PRD_2 = 200;
    private static final int MAX_QTY_PRD_3 = 300;
    private static final int MAX_QTY_PRD_4 = 400;
    private static final int MAX_QTY_PRD_5 = 500;
    
    public static void main(String[] args) {
        int qtyprd1 = 80;
        int qtyprd2 = 150;
        int qtyprd3 = 250;
        int qtyprd4 = 350;
        int qtyprd5 = 450;
        int splyprd = 20;
        int splyprd2 = 50;
        int splyprd3 = 100;
        int splyprd4 = 200;
        int splyprd5 = 300;
        
        int newqtyprd1 = qtyprd1 + splyprd;
        int newqtyprd2 = qtyprd2 + splyprd2;
        int newqtyprd3 = qtyprd3 + splyprd3;
        int newqtyprd4 = qtyprd4 + splyprd4;
        int newqtyprd5 = qtyprd5 + splyprd5;
        
        if (newqtyprd1 >= MIN_QTY_PRD_1 && newqtyprd1 <= MAX_QTY_PRD_1) {
            System.out.println("Product 1 supply accepted");
        } else {
            System.out.println("Product 1 supply rejected");
        }
}
}