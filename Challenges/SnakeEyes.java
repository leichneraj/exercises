import java.util.Random;
import java.util.Scanner;

public class SnakeEyes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times do you wish to roll? ");
        int rolls = scanner.nextInt();
        System.out.println(values(rolls));
    }

    public static int values(int rolls) {
        Random randomGenerator = new Random();
        int score = 0;

        while (rolls > 0) {
            int randomNumber1 = randomGenerator.nextInt(6) + 1;
            int randomNumber2 = randomGenerator.nextInt(6) + 1;

            if(randomNumber1 != randomNumber2) {
                rolls--;
                score = score + randomNumber1 + randomNumber2;
                if(rolls == 0) {
                    System.out.println("\nNo Snake Eyes.");
                }
            } else {
                int rollsToSnakeEyes = rolls;
            }
        }
        return ;
    }

}