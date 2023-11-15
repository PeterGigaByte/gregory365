package org.example;

import org.example.enums.Day;
import org.example.enums.YearType;

public class Main {
    public static void main(String[] args) {
        // Init params
        int years = 2000 - 1901;
        years = 1;
        Day dayToCount = Day.SUNDAY;
        Day startingDay = Day.MONDAY;
        YearType startingYearType = YearType.TWO; // 1901
        startingYearType = YearType.ONE;
        // Print result
        System.out.printf(
                "For (%s) with starting day (%s) and day type to count (%s) and starting year type (%s) is result: ('%s') .",
                years,
                startingDay.name(),
                dayToCount,
                startingYearType,
                getDaysCountForPeriod(years, dayToCount, startingDay, startingYearType)
        );
    }

    public static int getDaysCountForPeriod(int yearsToCount, Day dayToCount, Day startingDay, YearType startingYearType) {
        int result = 0;
        YearType currentYear = startingYearType;
        Day currentDay = startingDay;
        while (yearsToCount != 0) {

            int daysInYear =  currentYear.getDays();
            while (daysInYear != 0) {
                if (dayToCount == currentDay) {
                    result++;
                }
                currentDay = currentDay.getNextDay();
                daysInYear--;
            }

            yearsToCount--;
            currentYear = currentYear.incrementYear();
            currentDay = currentDay.getNextDay();
        }
        return result;
    }

}
