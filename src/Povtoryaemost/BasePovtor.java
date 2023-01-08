package Povtoryaemost;

import java.time.LocalDateTime;

abstract public class BasePovtor implements Povtoryaemost {

    public final LocalDateTime from;

    public BasePovtor(LocalDateTime from) {
        this.from = from;
    }

    public abstract LocalDateTime getTempDate();

    public LocalDateTime nextTime(LocalDateTime firstDateTime) {
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(from)) {
            return from;
        } else {
            LocalDateTime time = getTempDate();
            return LocalDateTime.of(time.getYear(), time.getMonth(), time.getDayOfMonth(), from.getHour(), from.getMinute());
        }
    }
}
