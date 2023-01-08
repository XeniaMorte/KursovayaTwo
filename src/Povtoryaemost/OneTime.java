package Povtoryaemost;

import java.time.LocalDateTime;

public class OneTime  implements Povtoryaemost{
    LocalDateTime from;


    public OneTime(LocalDateTime from) {
        this.from=from;
    }

    @Override
    public LocalDateTime nextTime(LocalDateTime firstDateTime) {
        return from;
    }
}
