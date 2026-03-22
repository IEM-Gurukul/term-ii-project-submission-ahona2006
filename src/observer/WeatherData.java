package observer;

import java.util.*;

public class WeatherData implements Subject {

    private List<Observer> observers =
            Collections.synchronizedList(new ArrayList<>());

    private float temperature;

    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {

        synchronized(observers) {
            for(Observer o : observers)
                o.update(temperature);
        }
    }
}