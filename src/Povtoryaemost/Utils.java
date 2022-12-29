package Povtoryaemost;

import java.time.LocalDateTime;

public class Utils {
    public  static  Povtoryaemost getPovtoryaemostById(Integer id, LocalDateTime from) {
        switch (id)
        {
            case 1: return new OneTime(from);
            case 2: return new Everyday(from);
            case 3: return new EveryWeekend(from);
            case 4: return new EveryMonth(from);
            case 5: return new EveryYear(from);
        }

      throw new RuntimeException(" ERROR");
    }
}
