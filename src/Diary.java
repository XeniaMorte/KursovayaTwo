import Povtoryaemost.EveryMonth;
import Povtoryaemost.EveryYear;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Random;

public class Diary {
    private Random random = new Random(1000);
    private HashMap<Integer, Task> mapTask = new HashMap<>();

    public Diary() {
        //тестовые данные
        this.addTask(new Task("WORk", "OIUYTREWSDFVBNJKUYTREDCVBN", TaskType.WORK, LocalDateTime.now(), new EveryYear()));

    }

    public void addTask(Task task) {
        Integer id = random.nextInt(1000);
        task.setId(id);
        mapTask.put(id, task);
    }

}
