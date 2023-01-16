public class Concatenation implements Sequence {

    private Sequence sequence1;
    private Sequence sequence2;

    public Concatenation(Sequence sequence1, Sequence sequence2) {
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
    }

    @Override
    public String printedSeq() {
        return sequence1.printedSeq().concat(sequence2.printedSeq());
    }
}
