package mattresssales;

public class Product implements
        IProduct{
    private final String[] products={
        "Cozy Nigths Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };
    
    private final int[][] sales;
    public Product(int[][] sales){
        this.sales = sales;
    }
    public int GetTotalProductsSold() {

        int total = 0;

        for (int[] sale : sales) {
            for (int j = 0; j < sale.length; j++) {
                total += sale[j];
            }
        }

        return total;
    }

    public double GetAverageProductsSold() {

        int total = GetTotalProductsSold();

        return (double) total / 9;
    }

    public String GetMostPopularProduct() {

        int highest = -1;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highest) {
                highest = productTotal;
                popularIndex = i;
            }
        }

        return products[popularIndex];
    }

    public int GetHighestProductSales() {

        int highest = 0;

        for (int[] sale : sales) {
            int total = 0;
            for (int j = 0; j < sale.length; j++) {
                total += sale[j];
            }
            if (total > highest) {
                highest = total;
            }
        }

        return highest;
    }
}
