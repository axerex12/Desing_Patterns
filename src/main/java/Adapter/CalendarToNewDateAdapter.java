package main.java.Adapter;

public class CalendarToNewDateAdapter implements NewDateInterface {
    private java.util.Calendar calendar;

    public CalendarToNewDateAdapter() {
        this.calendar = java.util.Calendar.getInstance();
    }

    @Override
    public void setDay(int day) {
        calendar.set(java.util.Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void setMonth(int month) {
        calendar.set(java.util.Calendar.MONTH, month - 1);
    }

    @Override
    public void setYear(int year) {
        calendar.set(java.util.Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    @Override
    public int getMonth() {
        return calendar.get(java.util.Calendar.MONTH);
    }

    @Override
    public int getYear() {
        return calendar.get(java.util.Calendar.YEAR);
    }

    @Override
    public void advanceDays(int days) {
        calendar.add(java.util.Calendar.DAY_OF_MONTH, days);
    }


   
    
}
