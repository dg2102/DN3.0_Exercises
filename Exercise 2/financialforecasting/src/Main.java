// Main.java
public class Main {
    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();
        
        double presentValue = 1000; // Initial investment
        double growthRate = 0.05; 
        int years = 10; // Forecasting for 10 years
        
        double futureValue = forecasting.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}