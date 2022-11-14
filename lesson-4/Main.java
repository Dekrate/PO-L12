import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal(2);
        BigDecimal b = new BigDecimal(3);
        BigDecimal c = new BigDecimal(4);
        BigDecimal d = new BigDecimal(5);
        BigDecimal e = new BigDecimal(6);
        Figure triangle = new Triangle(a, b, c, d, false);

        BigDecimal bigDecimal = triangle.calculateArea();
        System.out.println(bigDecimal);
    }
}
