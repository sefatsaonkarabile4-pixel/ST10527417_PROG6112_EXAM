public class Product implements IProduct {
    private final String[] productNames;
    private final int[][] salesData;
    private int currentIndex = 0;

    
    public Product(int numProducts) {
    productNames = new String[numProducts];
    salesData = new int[numProducts][3]; 
    }

    Product() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Product() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Product() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public void addProductData(String name, int month1, int month2, int month3) {
        productNames[currentIndex] = name;
        salesData[currentIndex][0] = month1;
        salesData[currentIndex][1] = month2;
        salesData[currentIndex][2] = month3;
        currentIndex++;
    }

    public int GetTotalProductsSold() {
        int total = 0;
    for (int[] product : salesData) {
    for (int monthSale : product) {
                total += monthSale;
            }
        }
        return total;
    }

    public double GetAverageProductSold() {
        
     int totalEntries = salesData.length * 3;
     return (double) GetTotalProductsSold() / totalEntries;
    }

    public String GetMostPopularProduct() {
        int maxTotal = -1;
        int maxIndex = -1;

    for (int i = 0; i < salesData.length; i++) {
    int productTotal = 0;
    for (int monthSale : salesData[i]) {
                productTotal += monthSale;
            }
    if (productTotal > maxTotal) {
                maxTotal = productTotal;
                maxIndex = i;
            }
        }
        
  return productNames[maxIndex] + "(" + maxTotal + ")";
    }

    int TotalProductsSold(int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int TotalProductsSold(int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String MostPopularProduct(String[] products, int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double AverageProductsSold(int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int TotalProductsSold(int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String MostPopularProduct(String[] products, int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double AverageProductsSold(int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}