package Povtoryaemost;

import java.time.LocalDateTime;

public class Everyday extends BasePovtor implements Povtoryaemost {


    public Everyday(LocalDateTime from) {
        super(from);

    }

    @Override
    public LocalDateTime getTempDate() {
        return LocalDateTime.now().plusDays(1);
    }


}
