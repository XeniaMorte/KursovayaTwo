import Povtoryaemost.EveryMonth;
import Povtoryaemost.EveryYear;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Diary {
    private HashMap<Integer, Task> mapTask = new HashMap<>();
    private static Integer id = 0;

    public Diary() {
        //тестовые данные
        // this.addTask(new Task("WORk", "OIUYTREWSDFVBNJKUYTREDCVBN", TaskType.WORK, LocalDateTime.now(), new EveryYear()));

    }

    public void addTask(Task task) {
        Integer id = ++Diary.id;
        task.setId(id);
        mapTask.put(id, task);
    }
    public List<Task> getAllTasksByToday(){
        return
        mapTask.values().stream().filter((task)->task.isDateActual(LocalDateTime.now())).collect(Collectors.toList());
    }

    public void deleteTaskById(int delitedId) {
        mapTask.remove(delitedId);
    }
}
