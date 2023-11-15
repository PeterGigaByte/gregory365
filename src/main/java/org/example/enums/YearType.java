package org.example.enums;

public enum YearType {
    ONE(0, 365),
    TWO(1, 365),
    THREE(2, 365),
    FOUR(3, 366);
    final int code;
    final int days;

    YearType(int code, int days) {
        this.code = code;
        this.days = days;
    }

    private YearType getByCode(int code) {
        switch (code) {
            case 1 -> {
                return TWO;
            }
            case 2 -> {
                return THREE;
            }
            case 3 -> {
                return FOUR;
            }
            default -> {
                return ONE;
            }
        }
    }

    public YearType incrementYear() {
        int code = this.code + 1;
        return getByCode(code);
    }

    public int getDays() {
        return days;
    }
}
