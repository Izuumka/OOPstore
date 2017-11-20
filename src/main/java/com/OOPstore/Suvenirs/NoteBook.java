package com.OOPstore.Suvenirs;

public class NoteBook extends Suvenir {
    private boolean calendar;
    protected NoteBook(int number, String name, int price, String type, boolean calendar) {
        super(number,name, price, type);
        this.calendar = calendar;
    }

    public boolean isCalendar() {
        return calendar;
    }

    public void setCalendar(boolean calendar) {
        this.calendar = calendar;
    }
}
