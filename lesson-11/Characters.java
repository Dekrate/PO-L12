public class Characters implements Sequence {
    private String string;

    public Characters(String string) {
        this.string = string;
    }

    @Override
    public String printedSeq() {
        return string;
    }
}
