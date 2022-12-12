import interfaces.Forecast;
import logic.Weather;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Forecast fake = new Forecast.Fake();
        Weather weather = new Weather(BigDecimal.TWO, fake);
        assert weather.currentWeather().equals(BigDecimal.valueOf(3.0));
    }
}
