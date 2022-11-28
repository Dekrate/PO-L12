public class Main {
    public static void main(String[] args) {
        Logarithm logarithm = new Logarithm(0, 1);
        try {
            System.out.println(logarithm.doubleValue());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
