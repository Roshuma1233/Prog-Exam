package PrintProduct;

import mattresssales.Product;

public class PrintProduct {

    private final Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void PrintTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    public void PrintAverageSales() {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n",
                product.GetAverageProductsSold());
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct()
                + " (" + product.GetHighestProductSales() + ")");
    }

    public void PrintReport() {

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*************************************");

        PrintTotalSales();
        PrintAverageSales();
        PrintMostPopularProduct();
    }
}