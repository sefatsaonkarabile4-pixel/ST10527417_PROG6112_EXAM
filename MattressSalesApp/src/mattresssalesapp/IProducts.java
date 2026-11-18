public interface IProducts {
    int GetTotalProductsSold(int[][] sales);
    double GetAverageProductsSold(int[][] sales);
    String GetMostPopularProduct(String[] products, int[][] sales);
}