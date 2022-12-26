package Povtoryaemost;

public class Utils {
    public  static  Povtoryaemost getPovtoryaemostById(Integer id) {
        switch (id)
        {
            case 1: return new OneTime();
            case 2: return new Everyday();
            case 3: return new EveryWeekend();
            case 4: return new EveryMonth();
            case 5: return new EveryYear();
        }

      throw new RuntimeException(" ERROR");
    }
}
