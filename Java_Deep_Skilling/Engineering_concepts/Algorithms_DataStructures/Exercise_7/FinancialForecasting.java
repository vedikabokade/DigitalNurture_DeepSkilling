public class FinancialForecasting {

    // Recursive Method
    public static double futureValue(double currentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;      // 10%
        int years = 5;

        double result = futureValue(currentValue, growthRate, years);

        System.out.printf("Future Value after %d years = ₹%.2f%n", years, result);
    }
}


// output
// Future Value after 5 years = ?16105.10
// PS C:\Users\hp\Desktop\DigitalNurture_DeepSkilling> 