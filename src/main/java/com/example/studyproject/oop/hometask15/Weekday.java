package com.example.studyproject.oop.hometask15;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay(Weekday weekday) {
        switch (weekday) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                return true;
            }
            case SATURDAY, SUNDAY -> {
                return false;
            }
        }
        return false;
    }

    public boolean isWeekEnd(Weekday weekday) {
        return !(isWeekDay(weekday));
    }
}
