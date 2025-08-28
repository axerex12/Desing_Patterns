package main.java.WeatherReport_Observer;

import java.util.List;

public class WeatherStation extends Thread {
    private int temperature;
    private List<WeatherObserver> observers;
    private int minTemperature;
    private int maxTemperature;

    public WeatherStation(int minTemperature, int maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.observers = new java.util.ArrayList<>();
        this.temperature = minTemperature + (int) (Math.random() * (maxTemperature - minTemperature + 1));
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        for (WeatherObserver observer : observers) {
            observer.updateWeather(temperature);
        }
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void run() {
        while (true) {
            int change = (int) (Math.random() * 2);
            if (change == 0) {
                setTemperature(temperature - 1);
                if (temperature <= minTemperature) {
                    setTemperature(temperature + 1);
                    continue;
                }
            } else {
                setTemperature(temperature + 1);
                if (temperature >= maxTemperature) {
                    setTemperature(temperature - 1);
                    continue;
                }
            }
            try {
                Thread.sleep((long) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
