package behavioural.observer;

import behavioural.observer.Displays.ForeCastDisplay;
import behavioural.observer.Displays.GeneralDisplay;
import behavioural.observer.Displays.StatisticsDisplay;
import behavioural.observer.WeatherStation.WeatherStation;

public class ObserverDemo {
    public static void main(String[] args) {

        WeatherStation weatherStation = new behavioural.observer.WeatherStation.WeatherStation();

        GeneralDisplay generalDisplay = new GeneralDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherStation);

        weatherStation.register(generalDisplay);
        weatherStation.register(statisticsDisplay);
        weatherStation.register(foreCastDisplay);

        weatherStation.setMeasurements(10, 11, 12);
        weatherStation.setMeasurements(12, 12, 14);
        weatherStation.setMeasurements(19, 18, 17);

    }
}