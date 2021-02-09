package by.ivramko.solid.d.solution;

import java.util.Arrays;

public class WeatherAggregator {

    private WeatherSource[] weatherSources;

    public WeatherAggregator(WeatherSource[] weatherSource){
        this.weatherSources = weatherSource;
    }

    public double getTemperature(){
        return Arrays
                .stream(weatherSources)
                .mapToDouble(WeatherSource::getWeatherInCelcius)
                .average()
                .getAsDouble();
    }

}
