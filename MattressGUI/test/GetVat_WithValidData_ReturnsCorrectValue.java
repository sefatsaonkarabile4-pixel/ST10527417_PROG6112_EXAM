/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author 27655
 */
public class GetVat_WithValidData_ReturnsCorrectValue {
    
    public GetVat_WithValidData_ReturnsCorrectValue() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
import java.util.Scanner;

public class SalesReportApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // We have 3 products in the example
        Product productLogic = new Product(3);
        PrintProduct printer = new PrintProduct();

        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Loop to get user input for all 3 products
        for (String name : productNames) {
            System.out.println(); // Blank line for neatness
            System.out.print("Enter number of sales for month 1 for " + name + ": ");
            int m1 = scanner.nextInt();
            System.out.print("Enter number of sales for month 2 for " + name + ": ");
            int m2 = scanner.nextInt();
            System.out.print("Enter number of sales for month 3 for " + name + ": ");
            int m3 = scanner.nextInt();

            productLogic.addProductData(name, m1, m2, m3);
        }

        // Print the final report
        printer.printReport(productLogic);
        
        scanner.close();
    }
}