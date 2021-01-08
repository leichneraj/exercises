import java.util.Scanner;
import java.io.*;

public class Todo {

    String[] tasks;
    private String description, dueDate;
    private boolean completed;
    private int priority;
    File list;
    Scanner scanList;
    
    public Todo(String description, String dueDate, boolean completed, int priority) {
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
        this.priority = priority;

        newTask();
    }

    public String getDescription() {
        return this.description;
    }

    public void newTask() {
        try {

            list = new File("list.csv");
            scanList = new Scanner(list);

            String[] tasks = scanList.nextLine().split(",");
            PrintWriter printNew = new PrintWriter(list);

            for(String task : tasks) {
                printNew.print(task + ",");
            }
            printNew.print(description + "," + dueDate + "," + completed + "," + priority);

            printNew.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }

}