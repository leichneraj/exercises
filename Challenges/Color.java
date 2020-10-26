import java.util.Scanner;
import java.util.Random;

public class Color {
    Scanner scanner = new Scanner(System.in);
    Random randomGenerator = new Random();

    private int redValue, greenValue, blueValue, colorToBeChanged, percentage, humanRed, humanGreen, humanBlue, blendedRed, blendedGreen, blendedBlue;
    private boolean darken;
    private String hexDecimal, hex;

    public Color() {

        redValue = randomGenerator.nextInt(255);
        greenValue = randomGenerator.nextInt(255);
        blueValue = randomGenerator.nextInt(255);
        colorToBeChanged = randomGenerator.nextInt(2);
        darken = randomGenerator.nextBoolean();
        percentage = randomGenerator.nextInt(100);
        System.out.println("\nRandom color: [" + redValue + "," +greenValue + "," + blueValue + "]\n");

    }

    public String humanInput() {
        
        System.out.print("Would you like to input hex or decimal values? (hex/dec) ");
        hexDecimal = scanner.next();

        if(hexDecimal.contains("hex")) {
            
            System.out.print("Enter a hex code for red: ");
            hex = scanner.next();
            humanRed = Integer.parseInt(hex, 16); 

            System.out.print("Enter a hex code for green: ");
            hex = scanner.next();
            humanGreen = Integer.parseInt(hex, 16); 

            System.out.print("Enter a hex code for blue: ");
            hex = scanner.next();
            humanBlue = Integer.parseInt(hex, 16); 

        } else {

            System.out.print("Enter decimal value for red: ");
            humanRed = scanner.nextInt();

            System.out.print("Enter decimal value for green: ");
            humanGreen = scanner.nextInt();
            
            System.out.print("Enter decimal value for blue: ");
            humanBlue = scanner.nextInt();

        }

        if(humanRed < 0) {
            humanRed = 0;
        } else if(humanRed > 255) {
            humanRed = 255;
        }

        if(humanGreen < 0) {
            humanGreen = 0;
        } else if(humanGreen > 255) {
            humanGreen = 255;
        }

        if(humanBlue < 0) {
            humanBlue = 0;
        } else if(humanBlue > 255) {
           humanBlue = 255;
        }

        System.out.println("\nHuman entered color: [" + humanRed + "," + humanGreen + "," + humanBlue + "]\n");
        return "Completed";

    }

    public String darkenLighten() {

        if(colorToBeChanged == 0) {

            if(darken) {
                redValue = redValue + (redValue * (percentage / 100));
            } else {
                redValue = redValue - (redValue * (percentage / 100));
            }
            if(redValue > 255) {
                redValue = 255;
            } else if(redValue < 0) {
                redValue = 0;
            }
            System.out.println((darken ? "Darkened" : "Lightened") + " random red by " + percentage + "%: [" + redValue + "," +greenValue + "," + blueValue + "]");

        } else if(colorToBeChanged == 1) {

            if(darken) {
                greenValue = greenValue + (greenValue * (percentage / 100));
            } else {
                greenValue = greenValue - (greenValue * (percentage / 100));
            }
            if(greenValue > 255) {
                greenValue = 255;
            } else if(greenValue < 0) {
                greenValue = 0;
            }
            System.out.println((darken ? "Darkened" : "Lightened") + " random green by " + percentage + "%: [" + redValue + "," +greenValue + "," + blueValue + "]");

        } else {

            if(darken) {
                blueValue = blueValue + (blueValue * (percentage / 100));
            } else {
                blueValue = blueValue - (blueValue * (percentage / 100));
            }
            if(blueValue > 255) {
                blueValue = 255;
            } else if(blueValue < 0) {
                blueValue = 0;
            }
            System.out.println((darken ? "Darkened" : "Lightened") + " random blue by " + percentage + "%: [" + redValue + "," +greenValue + "," + blueValue + "]");

        }

        return "Completed";

    }

    public String blend() {

        blendedRed = (redValue + humanRed) / 2;
        if(blendedRed > 255) {
            blendedRed = 255;
        }

        blendedGreen = (greenValue + humanGreen) / 2;
        if(blendedGreen > 255) {
            blendedGreen = 255;
        }

        blendedBlue = (blueValue + humanBlue) / 2;
        if(blendedBlue > 255) {
            blendedBlue = 255;
        }

        System.out.println("\nBlended human input and randomized input: [" + redValue + "," +greenValue + "," + blueValue + "]");
        return "Completed";

    }

    public String again() {

        System.out.print("\n\nWould you like to randomize the random color again? (y/n) ");
        String again = scanner.next();

        return again;

    }

}