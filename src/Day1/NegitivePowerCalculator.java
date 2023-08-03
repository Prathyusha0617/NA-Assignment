package Day1;

public class NegitivePowerCalculator {
	public static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        } else if (exponent < 0) {
            return 1.0 / calculatePositivePower(base, -exponent);
        } else {
            return calculatePositivePower(base, exponent);
        }
    }

    private static double calculatePositivePower(double base, int exponent) {
        double result = 1.0;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        double base = 2.0;
        int exponent = -3;
        double result = calculatePower(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

}
