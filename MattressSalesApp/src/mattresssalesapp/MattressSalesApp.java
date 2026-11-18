import java.util.Scanner;

public class MattressSalesApp {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            String[] products = {
                "Cozy Nights Monarch mattress",
                "Restonic Barbados mattress",
                "Sealy Phuket mattress"
            };
            
            
            int[][] sales = new int[3][3];
            
            
            for (int i = 0; i < products.length; i++) {
                System.out.println(); 
                
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + ": ");
                    sales[i][j] = scanner.nextInt();
                }
            }
            
            
            Product productLogic = new Product();
            
            
            int totalSales = productLogic.TotalProductsSold(sales);
            
            
            double averageSales = productLogic.AverageProductsSold(sales);
            long roundedAverage = Math.round(averageSales);
            
            String mostPopular = productLogic.MostPopularProduct(products, sales);
            
           
            System.out.println("\nPRODUCT SALES REPORT - 2026\n");
            System.out.println("********************************");
            System.out.println("TOTAL PRODUCT SALES: " + totalSales);
            System.out.println("AVERAGE PRODUCT SALES: " + roundedAverage);
            System.out.println("MOST POPULAR PRODUCT: " + mostPopular);
        }
    }
}
