class ObservableSubject:
    def __init__(self):
        self._observers = []
    def register_observer(self, observer):
        self._observers.append(observer)
    def remove_observer(self, observer):
        self._observers.remove(observer)
    def notify_observers(self):
        for observer in self._observers:
            observer.update(self)

class WeatherChannel(ObservableSubject):
    def __init__(self):
        super().__init__()
        self._temperature = 0
    def set_temperature(self, temperature):
        self._temperature = temperature
        self.notify_observers()
    def get_temperature(self):
        return self._temperature

class Observer:
    def update(self, subject):
        pass

class TemperatureDisplay(Observer):
    def update(self, subject):
        if isinstance(subject, WeatherChannel):
            temperature = subject.get_temperature()
            print(f"Temperature: {temperature}°C")

if __name__ == "__main__":
    weather_channel = WeatherChannel()
    display1 = TemperatureDisplay()
    display2 = TemperatureDisplay()
    weather_channel.register_observer(display1)
    weather_channel.register_observer(display2)
    weather_channel.set_temperature(25)
