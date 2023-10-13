import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codesoftTask4 {
    public static void main(String[] args) {
        // Define currency conversion rates (as of a certain date)
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);   // US Dollar
        exchangeRates.put("EUR", 0.85);  // Euro
        exchangeRates.put("GBP", 0.73);  // British Pound
        exchangeRates.put("JPY", 109.76); // Japanese Yen
        exchangeRates.put("INR", 73.31);  // Indian Rupee

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter!");
        System.out.println("Available Currencies: USD, EUR, GBP, JPY, INR");

        // Input currency selection
        System.out.print("Enter the source currency: ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        if (!exchangeRates.containsKey(sourceCurrency)) {
            System.out.println("Invalid source currency. Exiting.");
            return;
        }

        // Input amount to convert
        System.out.print("Enter the amount in " + sourceCurrency + ": ");
        double amount = scanner.nextDouble();

        // Input target currency
        System.out.print("Enter the target currency: ");
        scanner.nextLine(); // Consume newline character
        String targetCurrency = scanner.nextLine().toUpperCase();

        if (!exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid target currency. Exiting.");
            return;
        }

        // Perform currency conversion
        double sourceRate = exchangeRates.get(sourceCurrency);
        double targetRate = exchangeRates.get(targetCurrency);
        double convertedAmount = (amount / sourceRate) * targetRate;

        // Display the result
        System.out.println(amount + " " + sourceCurrency + " is equivalent to " + convertedAmount + " " + targetCurrency);
    }
}
