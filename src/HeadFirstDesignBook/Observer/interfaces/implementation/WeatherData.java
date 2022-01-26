package HeadFirstDesignBook.Observer.interfaces.implementation;

import HeadFirstDesignBook.Observer.interfaces.Observer;
import HeadFirstDesignBook.Observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 *  This is subject and observer will subscribe to it
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurement(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementChanged();
    }
}
