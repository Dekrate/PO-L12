public class Euro implements Currency {
    private final float value;

    public Euro(float value) {
        this.value = value;
    }

    @Override
    public Currency addedCurrency(float value, String currency) {
        FakeCantor fakeCantor = new FakeCantor();
        float v = fakeCantor.euroToRate(currency);
        return new Euro(this.value + value*v);
    }

    @Override
    public Currency subtractedCurrency(float value, String currency) throws ArithmeticException {
        FakeCantor fakeCantor = new FakeCantor();
        float v = fakeCantor.euroToRate(currency);
        float result = this.value - v*value;
        if (result > 0) {
            return new Euro(result);
        } else {
            throw new ArithmeticException("How dare you get indebted?");
        }
    }

    @Override
    public String abbreviation() {
        return "EUR";
    }

    @Override
    public String symbol() {
        return "€";
    }

    @Override
    public String balance() {
        return String.valueOf(value);
    }

    @Override
    public float toDollarExchangeRate() {
        FakeCantor fakeCantor = new FakeCantor();
        return fakeCantor.euroToRate("USD");
    }
}