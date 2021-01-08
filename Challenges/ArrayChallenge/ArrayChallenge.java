import java.io.*;
import java.util.Scanner;
import java.util.Random;

class ArrayChallenge {
    public static void main(String[] args) {
        File file = new File("ArrayData.csv");
        Scanner scanner;

        String[] array;
        try {
            scanner = new Scanner(file);
            createRandoms(file);

            array = scanner.next().split(",");

            scanner.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void createRandoms(File file) {
        Random random = new Random();

        try {
            PrintWriter print = new PrintWriter(file);

            int size = random.nextInt(20) + 1;
            while(size > 0) {
                print.print((random.nextInt(9) + 1) + ",");
                size--;
            }
            
            print.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}