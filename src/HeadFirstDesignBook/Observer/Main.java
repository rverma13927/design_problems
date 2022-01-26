package HeadFirstDesignBook.Observer;

import HeadFirstDesignBook.Observer.JavaInBuiltObserver.TestObserver;
import HeadFirstDesignBook.Observer.interfaces.Subject;
import HeadFirstDesignBook.Observer.interfaces.implementation.AnotherDisplayScreen;
import HeadFirstDesignBook.Observer.interfaces.implementation.CurrentDisplayScreen;
import HeadFirstDesignBook.Observer.interfaces.implementation.WeatherData;

import java.util.Observable;

public class Main {
    public static void main(String[] args) {
        Subject weatherData=new WeatherData();
        CurrentDisplayScreen currentScreen = new CurrentDisplayScreen(weatherData);
        AnotherDisplayScreen anotherScreen = new AnotherDisplayScreen(weatherData);
        weatherData.setMeasurement(1.0f,2.0f,2.0f);
        weatherData.setMeasurement(3.0f,2.0f,2.0f);
        weatherData.setMeasurement(6.0f,2.0f,2.0f);


        System.out.println("----------------------");
        HeadFirstDesignBook.Observer.JavaInBuiltObserver.WeatherData weatherData2 = new HeadFirstDesignBook.Observer.JavaInBuiltObserver.WeatherData();
        HeadFirstDesignBook.Observer.JavaInBuiltObserver.WeatherData weatherData3 = new HeadFirstDesignBook.Observer.JavaInBuiltObserver.WeatherData();

        TestObserver testObserver = new TestObserver(weatherData2);
        TestObserver testObserver2 = new TestObserver(weatherData3);
        Measurement measurementChanged = new Measurement(1.0f,2.0f,3.0f);
        weatherData2.setMeasurement(measurementChanged.getTemperature(),measurementChanged.getPressure(),measurementChanged.getPressure());
        Measurement measurementChanged2 = new Measurement(6.0f,9.0f,8.0f);
        weatherData3.setMeasurement(measurementChanged2.getTemperature(),measurementChanged2.getPressure(),measurementChanged2.getPressure());
    }
}
