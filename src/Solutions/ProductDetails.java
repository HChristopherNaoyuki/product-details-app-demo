package Solutions;

import java.util.Scanner;

public class ProductDetails
{
    // Instance variables for product details
    private String prodCode;
    private String prodName;
    private int qty;
    private double itemPrice;

    // Default constructor
    public ProductDetails()
    {
        this.prodCode = "";
        this.prodName = "";
        this.qty = 0;
        this.itemPrice = 0.0;
    }

    // Accessor method for product code
    public String getProdCode()
    {
        return this.prodCode;
    }

    // Accessor method for product name
    public String getProdName()
    {
        return this.prodName;
    }

    // Accessor method for quantity
    public int getQty()
    {
        return this.qty;
    }

    // Accessor method for item price
    public double getItemPrice()
    {
        return this.itemPrice;
    }

    // Mutator method for product code
    public void setProdCode(String prodCode)
    {
        this.prodCode = prodCode;
    }

    // Mutator method for product name
    public void setProdName(String prodName)
    {
        this.prodName = prodName;
    }

    // Mutator method for item price
    public void setItemPrice(double itemPrice)
    {
        this.itemPrice = itemPrice;
    }

    // Mutator method for quantity
    public void setQty(int qty)
    {
        this.qty = qty;
    }

    // Method to calculate total price based on quantity and item price
    public double calculateTotalPrice()
    {
        return getQty() * getItemPrice();
    }

    // Method to input values from the user
    public void inputValues()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product code: ");
        setProdCode(scanner.nextLine());

        System.out.print("Enter the product name: ");
        setProdName(scanner.nextLine());

        System.out.print("Enter the price of the product: ");
        setItemPrice(scanner.nextDouble());

        System.out.print("Enter the quantity: ");
        setQty(scanner.nextInt());
    }

    // Method to display the amount due
    public void displayAmountDue()
    {
        double amountDue = calculateTotalPrice();
        System.out.println("Amount due: $" + amountDue);
    }

    // Main method to execute the program
    public static void main(String[] args)
    {
        ProductDetails objProduct = new ProductDetails();
        objProduct.inputValues();
        objProduct.displayAmountDue();
    }
}
