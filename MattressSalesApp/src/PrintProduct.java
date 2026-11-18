

public class PrintProduct {
    public void printReport(Product product) {
        System.out.println("\nPRODUCT SALES REPORT - 2026\n");
        System.out.println("****************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(product.GetAverageProductSold()));
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
