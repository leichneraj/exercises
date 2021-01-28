java.util.Scanner();

public class DogTester {
    
    public static void main(String[] args) {
        Scaner scanner = new Scanner(System.in);
        String name, breed;
        int age;

        System.out.print("--------\n  Name: ");
        name = scanner.next();
        System.out.print("Breed: ");
        breed = scanner.next();
        System.out.print("Age: ");
        age = scanner.next();
        System.out.println("--------");

        printMenu();
    }

    public void printMenu() {
        
    }
}
