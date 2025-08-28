package main.java.WeatherReport_Observer;

public class ObserverB implements WeatherObserver  {
    @Override
    public void updateWeather(int temperature) {
        System.out.println("ObserverB: Temperature updated to " + temperature);
    }
}
