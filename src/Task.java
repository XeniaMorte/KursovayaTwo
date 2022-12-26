import Povtoryaemost.Povtoryaemost;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Task {
    private String name;
    private String field;
    private  TaskType type;
    private LocalDateTime dateTime;
    private int id;
    private Povtoryaemost povtoryaemost;

public Task(String name,String field,TaskType type,LocalDateTime dateTime,Povtoryaemost povtoryaemost){
    this.name=name;
    this.field=field;
    this.type=type;
    this.dateTime=dateTime;

    this.povtoryaemost=povtoryaemost;
}

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", field='" + field + '\'' +
                ", type=" + type +
                ", dateTime=" + dateTime +
                ", id=" + id +
                ", povtoryaemost=" + povtoryaemost +
                '}';
    }
}
