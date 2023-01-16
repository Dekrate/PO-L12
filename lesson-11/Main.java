public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Substring(new LowerCased(new Characters("ABC")), 1);
        System.out.println(sequence.printedSeq());
    }
}
