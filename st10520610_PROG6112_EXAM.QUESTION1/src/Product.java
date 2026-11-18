// Product.java
    public class Product implements IProduct {
        // Two-dimensional array to store sales:
        // Rows = Products (3 mattresses), Columns = Months (3 months)
        private int[][] salesData;
        private String[] productNames;

        // Constructor to initialize data
        public Product(int[][] salesData, String[] productNames) {
            this.salesData = salesData;
            this.productNames = productNames;
        }

        @Override
        public int GetTotalProductsSold() {
            int total = 0;
            for (int i = 0; i < salesData.length; i++) {
                for (int j = 0; j < salesData[i].length; j++) {
                    total += salesData[i][j];
                }
            }
            return total;
        }

        @Override
        public double GetAverageProductSold() {
            int total = GetTotalProductsSold();
            int count = 0;
            for (int i = 0; i < salesData.length; i++) {
                count += salesData[i].length;
            }
            return (count == 0) ? 0 : (double) total / count;
        }

        @Override
        public String GetMostPopularProduct() {
            int maxSales = -1;
            int bestProductIndex = 0;

            for (int i = 0; i < salesData.length; i++) {
                int productTotal = 0;
                for (int j = 0; j < salesData[i].length; j++) {
                    productTotal += salesData[i][j];
                }
                if (productTotal > maxSales) {
                    maxSales = productTotal;
                    bestProductIndex = i;
                }
            }
            return productNames[bestProductIndex] + " (" + maxSales + ")";
        }
    }

