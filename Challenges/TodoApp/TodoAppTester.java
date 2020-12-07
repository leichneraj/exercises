public class TodoAppTester {
    
    public static void main(String[] args) {
        TodoApp hw = new TodoApp("Do math homework", "12-10-2020", false, 2); // Creates new task
        hw.printToFile(); // Prints to the list.csv
    }

}
