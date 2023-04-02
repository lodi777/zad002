package pl.kurs.zad;

public class TimeConverter {
    long convertHoursToMinutes(long hour) {
        return hour * 60L;
    }

    long convertMinutesToSeconds(long minute) {
        return minute * 60;
    }

    long convertSecondsToMilliseconds(long second) {
        return second * 1000L;
    }

}
