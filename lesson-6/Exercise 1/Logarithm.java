

// Before refactor
public class Logarithm implements Numbers {

    private final double base;
    private final double argument;

    @Override
    public double doubleValue() throws ArithmeticException {
        if (base > 0 && base != 1 && argument > 0 && Math.log(this.base) != 0) {
            return Math.log(this.argument) / Math.log(this.base);
        } else {
            throw new ArithmeticException("Invalid argument - check if base > 0 && base != 1 and argument > 0");
        }
    }

    public Logarithm(double inputBase, double inputArgument) {
        this.base = inputBase;
        this.argument = inputArgument;
    }
}
