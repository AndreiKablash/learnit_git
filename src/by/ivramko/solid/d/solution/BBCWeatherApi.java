package by.ivramko.solid.d.solution;

public class BBCWeatherApi implements WeatherSource {

    @Override
    public double getWeatherInCelcius() {
        return 0;
    }

    private double getTemperatureFahrenheit(){
        return 0;
    }

    private double toCelcius( double temperatureFahrenheit){
        return (temperatureFahrenheit -32)/1.8f;
    }
}
