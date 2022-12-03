

// Before refactor
public class Logarithm implements Numbers {

    private final double base;
    private final double argument;

    @Override
    public double doubleValue() throws ArithmeticException {
        if (base <= 0)
            throw new ArithmeticException("Base must be > 0!");
        if (base == 1)
            throw new ArithmeticException("Base must be different from 1!");
        if (argument <= 0)
            throw new ArithmeticException("Argument must be positive!");
        if (Math.log(this.base) != 0)
            throw new ArithmeticException("You can't divide by 0!");
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
