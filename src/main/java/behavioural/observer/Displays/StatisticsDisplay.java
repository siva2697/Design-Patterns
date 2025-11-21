package behavioural.observer.Displays;


import behavioural.observer.WeatherStation.WeatherStation;

public class StatisticsDisplay implements IObserver {

    WeatherStation weatherStation;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {

        System.out.println(
            weatherStation.getTemp() + " Avg " +
            weatherStation.getHumidity() + " Avg"
        );

    }
}
