package HeadFirstDesignBook.Observer.interfaces.implementation;

import HeadFirstDesignBook.Observer.interfaces.Display;
import HeadFirstDesignBook.Observer.interfaces.Observer;
import HeadFirstDesignBook.Observer.interfaces.Subject;

public class CurrentDisplayScreen implements Display , Observer {
    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentDisplayScreen(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public String toString() {
        return "CurrentDisplayScreen{" +
                "weatherData=" + subject +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
