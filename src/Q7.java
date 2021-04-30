import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        MultiItemSale ms1 = new MultiItemSale();
        Scanner keyboard = new Scanner(System.in);

        while (true){
            System.out.println("Enter s for a sale and d for a discount sale and q for quit.");
            String first = keyboard.nextLine();
            if (first.charAt(0) == 'q') {
                break;
            }
            else if (first.charAt(0) == 's'){
                System.out.println("Enter the item name");
                String item = keyboard.nextLine();
                if (item == null){
                    System.out.println("Null String");
                    System.exit(0);
                }
                System.out.println("Enter the price:");
                double price = keyboard.nextDouble();
                keyboard.nextLine();
                if (price < 0){
                    System.out.println("Negative Price.");
                    System.exit(0);
                }
                Sale s1 = new Sale(item, price);
                ms1.insertSale(s1);
            }
            else if (first.charAt(0) == 'd'){
                System.out.println("Enter name of item: ");
                String item = keyboard.nextLine();
                if ( item == null ) {
                    System.err.println("Null string");
                    System.exit(0);
                } // end of if ()

                System.out.println("Enter item's price: ");
                double temp = keyboard.nextDouble();
                keyboard.nextLine();  // Eat newline
                if ( temp < 0 ) {
                    System.err.println("Negative price.");
                    System.exit(0);
                } // end of if ()

                System.out.println("Enter percentage discount as a double."
                        + "\nFor example 6.5 for 6.5%");
                double tempDis = keyboard.nextDouble();
                keyboard.nextLine();  // Eat newline
                if ( tempDis < 0 ) {
                    System.err.println("Negative discount.");
                    System.exit(1);
                }
                DiscountSale d1 = new DiscountSale(item, temp, tempDis);
                ms1.insertSale(d1);

            }
        }
        System.out.println(ms1);
        System.out.println("Total Bill: $" + ms1.computeTotal());
    }
}
