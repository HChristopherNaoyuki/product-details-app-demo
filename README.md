# Product Details Application

## Overview
The Product Details application is a simple Java console program that allows users to input product information such as product code, name, price, and quantity. It then calculates and displays the total amount due based on the provided details.

## Features
- Input product code, name, price, and quantity.
- Calculate total price based on quantity and unit price.
- Display the amount due.

## Prerequisites
- Java Development Kit (JDK) 8 or higher.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a simple text editor.

## Setup

### Running the Application
1. **Clone the Repository** (if applicable):
   ```bash
   git clone https://github.com/HChristopherNaoyuki/product-details-app-demo.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd product-details
   ```

3. **Compile the Java File**:
   ```bash
   javac Solutions/ProductDetails.java
   ```

4. **Run the Application**:
   ```bash
   java Solutions.ProductDetails
   ```

## Code Explanation
- **ProductDetails Class**: Contains instance variables for product details, including:
  - `prodCode`: Product code.
  - `prodName`: Product name.
  - `qty`: Quantity of the product.
  - `itemPrice`: Price per item.

- **Constructors**: A default constructor initializes the product details to default values.

- **Accessor and Mutator Methods**: These methods allow for getting and setting the values of instance variables.

- **calculateTotalPrice Method**: Calculates the total price based on quantity and item price.

- **inputValues Method**: Prompts the user to enter product details via console input.

- **displayAmountDue Method**: Calculates and displays the total amount due.

- **Main Method**: Instantiates the `ProductDetails` class, collects input from the user, and displays the amount due.

## Example Usage
When you run the application, it will prompt you to enter:
1. Product code
2. Product name
3. Price of the product
4. Quantity

After entering the information, it will display the total amount due.
