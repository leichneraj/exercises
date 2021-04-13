public class APCalander {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2003));
        System.out.println(isLeapYear(2004));

        System.out.println(numberOfLeapYears(2000, 2020));

        System.out.println(firstDayOfYear(233));

        System.out.println(dayOfYear(9, 14, 2004));

        System.out.println(dayOfWeek(9, 14, 2004));
    }

    private static boolean isLeapYear(int year) {
        if((year % 4) == 0 && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    private static int numberOfLeapYears(int year1, int year2) {
        int amount = 0;
        for(int x = year1; x <= year2; x++) {
            if(isLeapYear(x)) {
                amount++;
            }
        }
        return amount;
    }

    private static int firstDayOfYear(int year) {
        return numberOfLeapYears(0, year) % 7;
    }

    private static int dayOfYear(int month, int day, int year) {
        if(month == 1) {
            return day;
        } else if(month == 2) {
            return day + 31;
        } else if(month == 3) {
            if(isLeapYear(year)) {
                return day + 29 + 31;
            } else {
                return day + 28 + 31;
            }
        } else if(month == 4) {
            if(isLeapYear(year)) {
                return day + 29 + 62;
            } else {
                return day + 28 + 62;
            }
        } else if(month == 5) {
            if(isLeapYear(year)) {
                return day + 29 + 93;
            } else {
                return day + 28 + 93;
            }
        } else if(month == 6) {
            if(isLeapYear(year)) {
                return day + 29 + 124;
            } else {
                return day + 28 + 124;
            }
        } else if(month == 7) {
            if(isLeapYear(year)) {
                return day + 29 + 154;
            } else {
                return day + 28 + 154;
            }
        } else if(month == 8) {
            if(isLeapYear(year)) {
                return day + 29 + 185;
            } else {
                return day + 28 + 185;
            }
        } else if(month == 9) {
            if(isLeapYear(year)) {
                return day + 29 + 216;
            } else {
                return day + 28 + 216;
            }
        } else if(month == 10) {
            if(isLeapYear(year)) {
                return day + 29 + 246;
            } else {
                return day + 28 + 246;
            }
        } else if(month == 11) {
            if(isLeapYear(year)) {
                return day + 29 + 277;
            } else {
                return day + 28 + 277;
            }
        } else if(month == 12) {
            if(isLeapYear(year)) {
                return day + 29 + 307;
            } else {
                return day + 28 + 307;
            }
        } else {
            return -1;
        }
    }

    public static int dayOfWeek(int month, int day, int year) {
        return (dayOfYear(month, day, year) % 7);
    }
}