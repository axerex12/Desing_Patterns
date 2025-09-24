package main.java.Adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();
        date.setDay(30);
        date.setMonth(4);
        date.setYear(1945);
        System.out.println("Starting date: " + date.getDay() + "/" + (date.getMonth() + 1) + "/" + date.getYear());
        date.advanceDays(10);
        System.out.println("Date after advancing: " + date.getDay() + "/" + (date.getMonth() + 1) + "/" + date.getYear());
    }
    
}
