enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class enumexample {
    public static void main(String[] args) {
        for (WeekDay day : WeekDay.values()) {
            if (day.isWeekend()) {
                System.out.println(day + " is a weekend.");
            } else {
                System.out.println(day + " is a weekday.");
            }
        }

        WeekDay today = WeekDay.valueOf("SATURDAY");
        System.out.println("Today is " + today);
    }
}
