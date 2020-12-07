import java.util.Scanner;
import java.io.*;

public class TodoApp {

    private String description, dueDate;
    private boolean completed = false;
    private int priority;
    

    public TodoApp(String description, String dueDate, boolean completed, int priority) {
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
        this.priority = priority;
    }

    public  void printToFile() {
        try {
            PrintWriter list = new PrintWriter("list.csv");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}