import java.util.Scanner;

public class Exercise3Redo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cents?");
        int inputCents = scanner.nextInt();
        scanner.close();

        int cents = (inputCents % 100);
        int dollars = (inputCents - cents);

        System.out.print(print(format(coinTypeAndCount(cents), inputCents)));
    }

    public static int[] coinTypeAndCount (int cents) {
        int[] coinTypeAndCount = new int[5]; // the counts are calculated on the right - Example: 'cents / 25'
        if(cents >= 25) {
            coinTypeAndCount[0] = cents / 25; // Type: quarters, shown by '[0]'
        } else if((cents - (coinTypeAndCount[0] * 25)) >= 10) { 
            coinTypeAndCount[1] = cents - (coinTypeAndCount[0] * 25); // Type: dimes, shown by '[1]'
        } else if((cents - (coinTypeAndCount[1] * 10)) >= 5) {
            coinTypeAndCount[2] = cents - (coinTypeAndCount[1] * 10); // Type: nickels, shown by '[2]'
        } else if((cents - (coinTypeAndCount[2] * 10)) >= 1) {
            coinTypeAndCount[3] = cents - (coinTypeAndCount[2] * 5); // Type: pennies, shown by '[3]'
        } else if(cents == 0) {
            coinTypeAndCount[4] = 0; // if the cents = 0 then it will only print out the dollars. Shown by '[4]'
        }
        
        return coinTypeAndCount;
    }

    public static String format (int[] coinTypeAndCount, int inputCents) {
        String format = "";
        boolean[] usedOrNot = new boolean[5];
        usedOrNot[0] = false;
        usedOrNot[1] = false;
        usedOrNot[2] = false;
        usedOrNot[3] = false;
        usedOrNot[4] = false;

        switch(coinTypeAndCount[0]) { // quarters only

            case 1: // singular quarters formatting
            if(!usedOrNot[0]) {
                if((inputCents % 100) >= 1 && coinTypeAndCount[1-3] == 0) {
                    format = "and 1 quarter.";
                } else if((inputCents % 100) >= 1 && (coinTypeAndCount[1] > 0 || coinTypeAndCount[2] > 0 || coinTypeAndCount[3] > 0)) {
                    format = "1 quarter,";
                    usedOrNot[0] = true;
                } else if((inputCents % 100) == 0 && (coinTypeAndCount[1] > 0 || coinTypeAndCount[2] > 0 || coinTypeAndCount[3] > 0) && (coinTypeAndCount[1] > 0 || coinTypeAndCount[2] > 0 || coinTypeAndCount[3] > 0)) {
                    format = 
                }
            }

            break;
            case 2-3: // multiple quarters formatting

        }

        return format;
    }

    public static String print (String format) {
        String print = "";

        System.out.println(format);

        return print;
    }

}