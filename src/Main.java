// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // declaring variables for the price, sales tax, and total
        double purchasePrice = 20.00; // defined the total purchase as $19.50
        double salesTax = 5; // 5% sales tax constant
        double totalPrice = 0;

        // calculate the total after sales tax
        totalPrice = purchasePrice + (purchasePrice * (salesTax / 100));

        // output the purchase price, sales tax, and total price
        System.out.println("The original purchase price (in USD) is: " + purchasePrice);
        System.out.println("The sales tax is: " + salesTax + "%");
        System.out.println("The total price (in USD) is: " + totalPrice);
    }
}