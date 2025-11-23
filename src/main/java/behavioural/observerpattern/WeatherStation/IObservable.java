package behavioural.observerpattern.WeatherStation;


import behavioural.observerpattern.Displays.IObserver;

public interface IObservable {

    void register(IObserver observer);

    void unregister(IObserver o);

    public void notifyy();
}
