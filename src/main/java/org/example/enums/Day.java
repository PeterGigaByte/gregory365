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
        return switch (this) {
            case MONDAY -> TUESDAY;
            case TUESDAY -> WEDNESDAY;
            case WEDNESDAY -> THURSDAY;
            case THURSDAY -> FRIDAY;
            case FRIDAY -> SATURDAY;
            case SATURDAY -> SUNDAY;
            default -> MONDAY;
        };
    }
}
