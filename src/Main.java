public class Main {
    public static void main(String[] args)
    {
        double itemPrice = 100;
        double taxRate = .05;
        double salesTax = itemPrice * taxRate;

        System.out.println("For an item that costs $" + itemPrice + ", the sales tax is $" + salesTax + " ." );
    }
}