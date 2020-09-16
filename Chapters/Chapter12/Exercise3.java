import java.util.Scanner;

public class Exercise3 {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cents?\n");
        int inputCents = scanner.nextInt();
        scanner.close();

        if(inputCents > 0) {
            int cents = (inputCents % 100);
            int dollars = ((inputCents - cents) / 100);
            int quarters = (cents / 25);
            int dimes = ((cents - (quarters * 25)) / 10);
            int nickels = ((cents - (quarters * 25) - (dimes * 10)) / 5);
            int pennies = (cents - (quarters * 25) - (dimes * 10) - (nickels * 5));

            System.out.println("\n");

            if(dollars > 0) {
                if(dollars > 1 && quarters == 0 && dimes == 0 && nickels == 0 && pennies == 0) {
                    System.out.println("There are " + dollars + " dollars.");
                } else if((dollars > 1 && quarters > 0 && dimes == 0 && nickels == 0 && pennies == 0) || (dollars > 1 && quarters == 0 && dimes > 0 && nickels == 0 && pennies == 0) || (dollars > 1 && quarters == 0 && dimes == 0 && nickels > 0 && pennies == 0) || (dollars > 1 && quarters == 0 && dimes == 0 && nickels == 0 && pennies > 0)) {
                    System.out.println("There are " + dollars + " dollars");
                } else if(dollars > 1 && ((quarters > 0 && dimes > 0) || (quarters > 0 && nickels > 0) || (quarters > 0 && pennies > 0) || (dimes > 0 && pennies > 0) || (dimes > 0 && nickels > 0) || (nickels > 0 && pennies > 0))) {
                    System.out.println("There are " + dollars + " dollars,");
                } else if(dollars == 1 && quarters == 0 && dimes == 0 && nickels == 0 && pennies == 0) {
                    System.out.println("There is 1 dollar.");
                } else if((dollars == 1 && quarters > 0 && dimes == 0 && nickels == 0 && pennies == 0) || (dollars == 1 && quarters == 0 && dimes > 0 && nickels == 0 && pennies == 0) || (dollars == 1 && quarters == 0 && dimes == 0 && nickels > 0 && pennies == 0) || (dollars == 1 && quarters == 0 && dimes == 0 && nickels == 0 && pennies > 0)){
                    System.out.println("There is 1 dollar");
                } else if(dollars == 1 && ((quarters > 0 && dimes > 0) || (quarters > 0 && nickels > 0) || (quarters > 0 && pennies > 0) || (dimes > 0 && pennies > 0) || (dimes > 0 && nickels > 0) || (nickels > 0 && pennies > 0))) {
                    System.out.println("There is 1 dollar,");
                }
            }
    
            if(quarters > 0) {
                if(quarters > 1 && dollars == 0 && dimes == 0 && nickels == 0 && pennies == 0) {
                    System.out.println("There are " + quarters + " quarters.");
                } else if(quarters > 1 && dollars == 0 && (dimes > 0 || nickels > 0 || pennies > 0)) {
                    System.out.println("There are " + quarters + " quarters,");
                } else if(quarters == 1 && dollars == 0 && dimes == 0 && nickels == 0 && pennies == 0) {
                    System.out.println("There is 1 quarter.");
                } else if(quarters == 1 && dollars == 0 && (dimes > 0 || nickels > 0 || pennies > 0)) {
                    System.out.println("There is 1 quarter");
                } else if(quarters == 1 && dollars > 0 && dimes == 0 && nickels == 0 && pennies == 0) {
                    System.out.println("and 1 quarter.");
                } else if(quarters > 1 && dollars > 0 && (dimes > 0 || nickels > 0 || pennies > 0)) {
                    System.out.println(quarters + " quarters,");
                } else if(quarters > 1 && dollars > 0 && (dimes == 0 && nickels == 0 && pennies == 0)) {
                    System.out.println("and " + quarters + " quarters.");
                } else if(quarters == 1 && dollars > 0 && (dimes > 0 || nickels > 0 || pennies > 0)) {
                    System.out.println("1 quarter,");
                }
            }
    
            if(dimes > 0) {
                if(dimes > 1 && dollars == 0 && quarters == 0 && nickels == 0 && pennies == 0) {
                    System.out.println("There are " + dimes + " dimes.");
                } else if(dimes > 1 && dollars == 0 && quarters == 0 && (nickels > 0 || pennies > 0)) {
                    System.out.println("There are " + dimes + " dimes,");
                } else if(dimes == 1 && dollars == 0 && quarters == 0 && nickels == 0 && pennies == 0) {
                    System.out.println("There is 1 dime.");
                } else if(dimes == 1 && dollars == 0 && quarters == 0 && (nickels > 0 || pennies > 0)) {
                    System.out.println("There is 1 dime");
                } else if(dimes > 1 && (quarters > 0 || dollars > 0 ) && (nickels == 0 && pennies == 0)) {
                    System.out.println("and " + dimes + " dimes.");
                } else if(dimes > 1 && (dollars > 0 || quarters > 0) && (nickels > 0 || pennies > 0)) {
                    System.out.println(dimes + " dimes,");
                } else if(dimes == 1 && (dollars > 0 || quarters > 0 || nickels == 0 || pennies == 0)) {
                    System.out.println("and 1 dime.");
                } else if(dimes == 1 && (dollars > 0 || quarters > 0) && (nickels > 0 || pennies > 0)) {
                    System.out.println("1 dime,");
                }
            }

            if(nickels > 0) {
                if(nickels > 1 && dollars == 0 && quarters == 0 && dimes == 0 && pennies == 0) {
                    System.out.println("There are " + nickels + " nickels.");
                } else if(nickels == 1 && dollars == 0 && quarters == 0 && dimes == 0 && pennies == 0) {
                    System.out.println("There is 1 nickel.");
                } else if(nickels == 1 && dollars == 0 && quarters == 0 && dimes == 0 && pennies > 0) {
                    System.out.println("There is 1 nickel");
                } else if(nickels > 1 && dimes > 0 && (dollars == 0 && quarters == 0 && pennies == 0)) {
                    System.out.println("and " + nickels + " nickels.");
                } else if(nickels > 1 && (dollars > 0 || quarters > 0 || dimes > 0) && pennies > 0) {
                    System.out.println(nickels + " nickels,");
                } else if(nickels == 1 && ((dollars > 0 || quarters > 0 || dimes > 0) && pennies == 0)) {
                    System.out.println("and 1 nickel.");
                } else if(nickels == 1 && (dollars > 0 || quarters > 0 || dimes > 0) && pennies > 0) {
                    System.out.println("1 nickel,");
                }
            }

            if(pennies > 1 && dollars == 0 && quarters == 0 && dimes == 0 && nickels == 0) {
                System.out.println("There are " + pennies + " pennies.");
            } else if(pennies == 1 && dollars == 0 && quarters == 0 && dimes == 0 && nickels == 0) {
                System.out.println("There is 1 penny.");
            } else if(pennies > 1 && (dollars > 0 || quarters > 0 || dimes > 0 || nickels > 0)) {
                System.out.println("and " + pennies + " pennies.");
            } else if(pennies == 1){
                System.out.println("and 1 penny.");
            }

        } else {
            System.out.println("\n" + inputCents + " cents is not a valid number for this program.");
        }

    }

}