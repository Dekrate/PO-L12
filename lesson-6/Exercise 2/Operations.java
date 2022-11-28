public class Operations {
    private final int a;
    private final int b;

    public Operations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int max() {
        return a > b ? a : b;
    }

    public int min() {
        return a < b ? a : b;
    }

    public float avg() {
        return (a+b)/2F;
    }

    /*
    * public class NumberUtils {
2 public static int max(int a, int b) { return a > b ? a : b;}
3 public static int min(int a, int b) { return a < b ? a : b;}
4 public static float avg(int a, int b) { return (a + b) / 2;}
5 }*/
}
