import java.math.BigDecimal;

public class Triangle implements Figure {
    private final BigDecimal a;
    private final BigDecimal b;
    private final BigDecimal c;
    private final BigDecimal h;

    private final boolean isRectangular;

    public Triangle(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal h, boolean isRectangular) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.isRectangular = isRectangular;
    }

    @Override
    public BigDecimal calculateArea() {
        return isRectangular ? a.multiply(b).divide(BigDecimal.TWO) : a.multiply(h).divide(BigDecimal.TWO);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return a.add(b).add(c);
    }

    @Override
    public Figure scale() {
        return new Triangle(a.multiply(BigDecimal.TWO), b.multiply(BigDecimal.TWO), c.multiply(BigDecimal.TWO), h.multiply(BigDecimal.TWO), isRectangular);
    }
}
