package HeadFirstDesignBook.Observer.JavaInBuiltObserver;

import HeadFirstDesignBook.Observer.Measurement;

import java.util.Observable;
import java.util.Observer;

public class TestObserver implements Observer {
    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public TestObserver(java.util.Observable observable) {
        observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update");
        WeatherData measurementChanged = (WeatherData) o;
        System.out.println(measurementChanged.getHumidity() + " " + measurementChanged.getPressure() + " "+ measurementChanged.getTemperature());
    }
}
