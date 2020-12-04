import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick a word! ");
        String word = scanner.next();
        scanner.close();

        int times = word.length();

        while(times > 0) {
            System.out.println(word);
            times--;
        }
    }
}