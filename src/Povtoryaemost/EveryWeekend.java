package Povtoryaemost;

import java.time.LocalDateTime;

public class EveryWeekend extends BasePovtor implements Povtoryaemost {

    public EveryWeekend(LocalDateTime from) {
        super(from);

    }

    @Override
    public LocalDateTime getTempDate() {
        int currentDayOfWeek = LocalDateTime.now().getDayOfWeek().getValue();
        int executeDayofWeek = from.getDayOfWeek().getValue();
        if (currentDayOfWeek < executeDayofWeek) {
            int dif = executeDayofWeek - currentDayOfWeek;
            return LocalDateTime.now().plusDays(dif);
        }
        if (currentDayOfWeek == executeDayofWeek) {
            return LocalDateTime.now().plusDays(7);
        }
        int dif = 7 - (currentDayOfWeek - executeDayofWeek);
        return LocalDateTime.now().plusDays(dif);
    }
}
