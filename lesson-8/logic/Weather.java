package logic;

import interfaces.Forecast;

import java.math.BigDecimal;

public class Weather {
    private BigDecimal temperature;
    private Forecast forecast;

    public Weather(BigDecimal temperature, Forecast forecast) {
        this.temperature = temperature;
        this.forecast = forecast;
    }

    public BigDecimal currentWeather() {
        return forecast.currentWeather();
    }
}
