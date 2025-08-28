package main.java.WeatherReport_Observer;

public class ObserverA implements WeatherObserver {
    @Override
    public void updateWeather(int temperature) {
        System.out.println("ObserverA: Temperature updated to " + temperature);
    }
}


