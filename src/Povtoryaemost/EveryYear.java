package Povtoryaemost;

import java.time.LocalDateTime;

public class EveryYear extends BasePovtor implements Povtoryaemost{
    public EveryYear(LocalDateTime from) {
        super(from);

    }

    @Override
    public LocalDateTime getTempDate() {
        return LocalDateTime.now().plusYears(1);
    }


}
