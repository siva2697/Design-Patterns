package behavioural.observer.Displays;

import behavioural.observer.WeatherStation.WeatherStation;

public class GeneralDisplay implements IObserver {

    WeatherStation weatherStation;

    public GeneralDisplay(WeatherStation observable) {
        this.weatherStation = observable;
    }

    @Override
    public void update() {
        weatherStation.getTemp();
        weatherStation.getHumidity();
        weatherStation.getPressure();

        System.out.println(
            weatherStation.getTemp() + " " +
            weatherStation.getHumidity() + " " +
            weatherStation.getPressure()
        );
    }
}
