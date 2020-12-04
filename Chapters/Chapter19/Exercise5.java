import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick a word! ");
        String word = scanner.next();
        scanner.close();

        int times = 0;

        while(times < word.length()) {
            System.out.println(word.charAt(times));
            times++;
        }
    }
}