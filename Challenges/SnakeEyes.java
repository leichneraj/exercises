import java.util.Random;
import java.util.Scanner;
import java.util.AbstractMap.SimpleImmutableEntry;

public class SnakeEyes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.print("Enter value for how many times the dice must roll: ");
        int simulations = scanner.nextInt();
        scanner.close();

        int score = 0;
        boolean stop = false;

        while(simulations >= 1) {
            int dice1 = randomGenerator.nextInt(6);
            int dice2 = randomGenerator.nextInt(6);
            if(dice1 != dice2) {
                score = score + dice1 + dice2;
            } else if(!stop) {
                int finishedScore = score;
                System.out.println("Your score before Snake Eyes was: " + finishedScore);
                stop = true;
            }
            simulations--;
        }

    }
        
}