package com.OOPstore.Suvenirs;

public class NoteBook extends Suvenir {
    public boolean calendar;
    public NoteBook(int number, String name, int price, String type, boolean calendar) {
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
