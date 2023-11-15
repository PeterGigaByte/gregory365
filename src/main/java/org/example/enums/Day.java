package org.example.enums;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    Day() {
    }

    public Day getNextDay() {
        switch (this) {
            case MONDAY -> {
                return TUESDAY;
            }
            case TUESDAY -> {
                return WEDNESDAY;
            }
            case WEDNESDAY -> {
                return THURSDAY;
            }
            case THURSDAY -> {
                return FRIDAY;
            }
            case FRIDAY -> {
                return SATURDAY;
            }
            case SATURDAY -> {
                return SUNDAY;
            }
            case default -> {
                return MONDAY;
            }
        }
    }
}
