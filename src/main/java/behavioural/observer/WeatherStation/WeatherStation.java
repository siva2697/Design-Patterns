package behavioural.observer.WeatherStation;

import behavioural.observer.Displays.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    List<IObserver> observers;

    int temp;
    int humidity;
    int pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public void register(IObserver observer) {
        observers.add(observer);
    }
    @Override
    public void unregister(IObserver o) {
        int i = observers.indexOf(o);
        if(i >=0 ) {
            observers.remove(o);
        }
    }
    @Override
    public void notifyy() {
        for(IObserver observer: observers) {
            observer.update();
        }
    }

    public void setMeasurements(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyy();
    }
}
