import java.math.BigDecimal;

public class Rectangle implements Figure {
    private final BigDecimal a;
    private final BigDecimal b;

    public Rectangle(BigDecimal a, BigDecimal b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public BigDecimal calculateArea() {
        return a.multiply(b);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return a.multiply(BigDecimal.TWO).add(b.multiply(BigDecimal.TWO));
    }


    /**
     * @return scaled figure
     * It's ane example of immutability of classes in OOP.
     */
    @Override
    public Figure scale() {
        return new Rectangle(a.multiply(BigDecimal.TWO), b.multiply(BigDecimal.TWO));
    }
}
