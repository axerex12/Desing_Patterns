package main.java.WeatherReport_Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(-10, 40);
        station.start();

        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();

        station.addObserver(observerA);
        station.addObserver(observerB);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("\nRemoving ObserverB...");
        station.removeObserver(observerB);
    }

}
