public class MattressSalesReport {

    public static void main(String[] args) {

        // One-dimensional array
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array
        int[][] sales = new int[3][3];

        // Enter sales for three months
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            // Enter sales for three months
            for (int i = 0; i < products.length; i++) {
                
                for (int j = 0; j < 3; j++) {
                    
                    System.out.print(
                            "Enter number of sales for month "
                                    + (j + 1) + " for " + products[i] + ": "
                    );
                    
                    sales[i][j] = input.nextInt();
                }
                
                System.out.println();
            }
            
            // Calculate total sales for each product
            int[] productTotals = new int[3];
            
            int grandTotal = 0;
            
            for (int i = 0; i < products.length; i++) {
                
                for (int j = 0; j < 3; j++) {
                    
                    productTotals[i] += sales[i][j];
                }
                
                grandTotal += productTotals[i];
            }
            
            // Calculate average sales
            double average = (double) grandTotal / 9;
            
            // Find the most popular product
            int highest = productTotals[0];
            int popularIndex = 0;
            
            for (int i = 1; i < products.length; i++) {
                
                if (productTotals[i] > highest) {
                    
                    highest = productTotals[i];
                    popularIndex = i;
                }
            }
            
            // Display report
            System.out.println("\nPRODUCT SALES REPORT - 2026");
            System.out.println("************************************");
            
            System.out.println("TOTAL PRODUCT SALES: " + grandTotal);
            
            System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", average);
            
            System.out.println("MOST POPULAR PRODUCT: "
                    + products[popularIndex] + " (" + highest + ")");
        }
    }
}
