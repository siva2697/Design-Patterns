package behavioural.observer.WeatherStation;


import behavioural.observer.Displays.IObserver;

public interface IObservable {

    void register(IObserver observer);

    void unregister(IObserver o);

    public void notifyy();
}
