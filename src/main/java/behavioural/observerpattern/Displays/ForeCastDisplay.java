package behavioural.observerpattern.Displays;


import behavioural.observerpattern.WeatherStation.WeatherStation;

public class ForeCastDisplay implements IObserver {

    WeatherStation weatherStation;

    public ForeCastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {

        System.out.println(
            weatherStation.getTemp() + " Forecast " +
            weatherStation.getHumidity() + " Forecast " +
            weatherStation.getPressure()
        );

    }

}
