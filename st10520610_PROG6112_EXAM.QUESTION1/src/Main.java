import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = {
                "Cozy Nights Monarch mattress",
                "Restonic Barbados mattress",
                "Sealy Phuket mattress"
        };

        int[][] salesData = new int[3][3];

        // Capture user input matching the sample screenshot format
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + ": ");
                salesData[i][j] = scanner.nextInt();
            }
            System.out.println(); // spacing
        }

        Product productObj = new Product(salesData, productNames);
        PrintProduct printer = new PrintProduct(productObj);
        printer.printReport();

        scanner.close();
    }
}