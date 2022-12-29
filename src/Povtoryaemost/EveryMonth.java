package Povtoryaemost;

import java.time.LocalDateTime;

public class EveryMonth extends BasePovtor implements Povtoryaemost{

    public EveryMonth(LocalDateTime from) {
        super(from);

    }

    @Override
    public LocalDateTime getTempDate() {
        return LocalDateTime.now().plusMonths(1);
    }


}
