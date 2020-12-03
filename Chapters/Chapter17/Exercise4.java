import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome adventurer, to The Land!");
        System.out.print("What is your name? ");
        String name = scanner.next();
        System.out.println("Please distribute your characteristic points: (total must not be over 15)");

        System.out.print("Strength (1-10): ");
        int strength = scanner.nextInt();
        if(strength > 10) {
            strength = 10;
        } else if(strength < 1) {
            strength = 1;
        }

        System.out.print("Health (1-10): ");
        int health = scanner.nextInt();
        if(health > 10) {
            health = 10;
        } else if(health < 1) {
            health = 1;
        }

        System.out.print("Luck (1-10): ");
        int luck = scanner.nextInt();
        if(luck > 10) {
            luck = 10;
        } else if(luck < 1) {
            luck = 1;
        }
        scanner.close();

        if((strength + health + luck) > 15) {
            strength = 5;
            health = 5;
            luck = 5;
            System.out.println("\nYou have give your character too many points!  Default values have been assigned:");
        }

        System.out.println("\n" + name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
    }
}
