import java.util.Scanner;
import java.io.*;

public class TodoApp {

    File list;
    Scanner scanList;
    public static void main(String[] args) {
        TodoApp app = new TodoApp();

        app.menu();
    }

    public void menu() {
        System.out.println("==--- TODO APP ---==\n\nCurrent tasks:");
        try {
            scanList = new Scanner(list);

            String[] tasks = scanList.nextLine().split(",");

            int i = 0;
            for(String task : tasks) {
                if(i == 0 || (i )== 4) {

                }
                i++;
            }

            scanList.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}