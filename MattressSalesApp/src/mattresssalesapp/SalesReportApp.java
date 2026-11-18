import java.util.Scanner;

public class SalesReportApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           
 Product productLogic = new Product(3);
  PrintProduct printer = new PrintProduct();

        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        for (String name : productNames) {
 System.out.println(); 
  System.out.print("Enter number of sales for month 1 for " + name + ": ");
            int m1 = scanner.nextInt();
  System.out.print("Enter number of sales for month 2 for " + name + ": ");
            int m2 = scanner.nextInt();
  System.out.print("Enter number of sales for month 3 for " + name + ": ");
            int m3 = scanner.nextInt();

            productLogic.addProductData(name, m1, m2, m3);
        }

    
        printer.printReport(productLogic);
        
        scanner.close();
    }
}
