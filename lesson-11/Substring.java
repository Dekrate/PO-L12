public class Substring implements Sequence {
    private final Sequence sequence;
    private final int beginIndex;

    public Substring(Sequence sequence, int beginIndex) {
        this.sequence = sequence;
        this.beginIndex = beginIndex;
    }

    @Override
    public String printedSeq() {
        return sequence.printedSeq().substring(beginIndex);
    }
}
