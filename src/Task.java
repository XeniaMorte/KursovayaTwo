import Povtoryaemost.Povtoryaemost;

import java.time.LocalDateTime;

public class Task {
    private String name;
    private String comment;
    private  TaskType type;
    private LocalDateTime dateTime;
    private int id;
    private Povtoryaemost povtoryaemost;

public Task(String name,String comment,TaskType type,LocalDateTime dateTime,Povtoryaemost povtoryaemost){
    this.name=name;
    this.comment =comment;
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

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", field='" + comment + '\'' +
                ", type=" + type +
                ", dateTime=" + dateTime +
                ", id=" + id +
                ", povtoryaemost=" + povtoryaemost +
                '}';
    }
    public boolean isDateActual(LocalDateTime currentTime){
        LocalDateTime executionTime = povtoryaemost.nextTime(currentTime);
        return (executionTime.getYear()== currentTime.getYear()&& executionTime.getMonth()== currentTime.getMonth()&& executionTime.getDayOfMonth()== currentTime.getDayOfMonth());
    }
}
