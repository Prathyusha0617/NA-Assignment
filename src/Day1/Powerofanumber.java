package Day1;

public class Powerofanumber {
	public static int calculatePower(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative.");
        }

        int result = 1;
        
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = calculatePower(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

}
