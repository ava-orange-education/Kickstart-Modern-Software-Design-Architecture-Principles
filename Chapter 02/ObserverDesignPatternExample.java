import java.util.ArrayList;
import java.util.List;

interface ObservableSubject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class WeatherChannel implements ObservableSubject {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

interface Observer {
    void update(int temperature);
}

class TemperatureDisplay implements Observer {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Temperature: " + temperature + "°C");
    }
}
public class ObserverDesignPatternExample {
    public static void main(String[] args) {
        WeatherChannel weatherChannel = new WeatherChannel();
        TemperatureDisplay display1 = new TemperatureDisplay();
        TemperatureDisplay display2 = new TemperatureDisplay();

        weatherChannel.registerObserver(display1);
        weatherChannel.registerObserver(display2);
        weatherChannel.setTemperature(25);
    }
}
