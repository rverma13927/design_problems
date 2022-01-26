package HeadFirstDesignBook.Observer.interfaces;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
    public void setMeasurement(float v, float v1, float v2);
}
