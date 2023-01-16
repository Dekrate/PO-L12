public class LowerCased implements Sequence {

    private final Sequence sequence;

    public LowerCased(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public String printedSeq() {
        return sequence.printedSeq().toLowerCase();
    }
}
