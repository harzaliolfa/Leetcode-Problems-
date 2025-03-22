class Solution {
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysFromMonth(int month1, int day1, int month2, int day2) {
        int res = 0;

        // Days in the starting month
        res += DAYS_IN_MONTH[month1 - 1] - day1 + 1;

        // Days in the ending month
        res += day2;

        // Days in the months between month1 and month2
        for (int i = month1; i < month2 - 1; i++) {
            res += DAYS_IN_MONTH[i];
        }

        return res;
    }

    public int countDaysFromYear(int year1, int month1, int day1, int year2, int month2, int day2) {
        int res = 0;

        // Days in the starting year
        res += isLeapYear(year1) ? 366 - dayOfYear(year1, month1, day1) : 365 - dayOfYear(year1, month1, day1);

        // Days in the years between year1 and year2
        for (int year = year1 + 1; year < year2; year++) {
            res += isLeapYear(year) ? 366 : 365;
        }

        // Days in the ending year
        res += dayOfYear(year2, month2, day2);

        return res;
    }

    private int dayOfYear(int year, int month, int day) {
        int res = day;
        for (int i = 0; i < month - 1; i++) {
            res += DAYS_IN_MONTH[i];
        }
        if (month > 2 && isLeapYear(year)) {
            res += 1;
        }
        return res;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int daysBetweenDates(String date1, String date2) {
        String[] mydate1 = date1.split("-");
        String[] mydate2 = date2.split("-");

        int year1 = Integer.parseInt(mydate1[0]);
        int year2 = Integer.parseInt(mydate2[0]);
        int month1 = Integer.parseInt(mydate1[1]);
        int month2 = Integer.parseInt(mydate2[1]);
        int day1 = Integer.parseInt(mydate1[2]);
        int day2 = Integer.parseInt(mydate2[2]);

        if (year1 == year2) {
            if (month1 == month2) {
                return Math.abs(day1 - day2);
            } else {
                return countDaysFromMonth(month1, day1, month2, day2);
            }
        } else {
            return year2 > year1 ?
                countDaysFromYear(year1, month1, day1, year2, month2, day2) :
                countDaysFromYear(year2, month2, day2, year1, month1, day1);
        }
    }
}
