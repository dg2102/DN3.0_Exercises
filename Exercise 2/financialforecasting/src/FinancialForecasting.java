
public class FinancialForecasting {
    
 
    public double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if years is 0, return the present value
        if (years == 0) {
            return presentValue;
        }
        // Recurrence relation
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }
}