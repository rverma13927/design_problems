package HeadFirstDesignBook.Observer.interfaces.implementation;

import HeadFirstDesignBook.Observer.interfaces.Display;
import HeadFirstDesignBook.Observer.interfaces.Observer;
import HeadFirstDesignBook.Observer.interfaces.Subject;

public class AnotherDisplayScreen implements Display , Observer {

    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;

    public AnotherDisplayScreen(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
          this.humidity=humidity;
          this.temperature=temperature;
          this.pressure=pressure;
          display();
    }

    @Override
    public String toString() {
        return "AnotherDisplayScreen{" +
                "weatherData=" + subject +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
