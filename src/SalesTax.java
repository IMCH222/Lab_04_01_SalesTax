public class SalesTax
{
    public static void main(String[] args) {
        double itemPrice = 24.99;
        final double SALES_TAX = 0.05;
        double finalPrice = 0;
        double taxPrice = 0;
        taxPrice = itemPrice * SALES_TAX;
        finalPrice = itemPrice + taxPrice;
        System.out.println("The sales tax for your purchase is" + " " + "$"+ taxPrice + " " + "which makes you total:" + " " + " " + "$" + finalPrice);

    }
}