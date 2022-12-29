import Povtoryaemost.Utils;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Diary diary = new Diary();


        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        do {
            try {
                System.out.println("1.Добавить задачу");
                System.out.println("2.Получить список задач на день");
                System.out.println("3.Удалить задачу ");
                System.out.println("4.Выход");
                choise = scanner.nextInt();
                if (choise == 1) {
                    System.out.println("Как назвать задачу?");
                    String name = scanner.next();
                    System.out.println("Опишите задачу");
                    String field = scanner.next();
                    System.out.println("Какой тип задачи ? Нажмите 1 если личная или 2 если задача рабочая");
                    int number = scanner.nextInt();
                    System.out.println(" Выберите повторяемость задачи: " +
                            "1- однократная,\n" +
                            "2- ежедневная,\n" +
                            "3- еженедельная,\n" +
                            "4- ежемесячная,\n" +
                            "5- ежегодная.");

                    int povtor = scanner.nextInt();
                    diary.addTask(new Task(name, field, TaskType.getTaskbyNumber(number), LocalDateTime.now(), Utils.getPovtoryaemostById(povtor,LocalDateTime.now().plusHours(1))));

                }
                if (choise == 2) {
                    System.out.println( diary.getAllTasksByToday());
                }
                if (choise == 3) {
                    System.out.println("Какую  задачу удалить? Введити id задачи на удаление .");
                    int delitedId;
                  delitedId=  scanner.nextInt();
                  diary.deleteTaskById(delitedId);
                }
                if (choise == 4) {
                   return;
                }
            } catch (RuntimeException ext) {
                System.out.println("err: " + ext.getMessage());
            }

        }
        while (choise != 4);


    }
}
