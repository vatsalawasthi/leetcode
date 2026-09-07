class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };

        int totalDays = 0;

        // Count days in complete years
        for (int y = 1971; y < year; y++) {
            if (isLeap(y))
                totalDays += 366;
            else
                totalDays += 365;
        }

        // Count days in complete months
        int[] monthDays = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        for (int m = 1; m < month; m++) {
            totalDays += monthDays[m - 1];

            if (m == 2 && isLeap(year)) {
                totalDays++;
            }
        }

        // Add days before the given date
        totalDays += day - 1;

        // Jan 1, 1971 was Friday (index 5)
        return days[(5 + totalDays) % 7];
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }
}