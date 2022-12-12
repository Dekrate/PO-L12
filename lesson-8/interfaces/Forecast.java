  package interfaces;

import java.math.BigDecimal;

public interface Forecast {

    public BigDecimal currentWeather();
    final class Fake implements Forecast {
        @Override
        public BigDecimal currentWeather() {
            return BigDecimal.valueOf(3.0);
        }
    }
}
