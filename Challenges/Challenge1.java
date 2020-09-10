import java.util.Scanner;

public class Challenge1 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a value for Sunday's temperature:");
        String strSun = scanner.next();

        System.out.println("Pick a value for Monday's temperature:");
        String strMon = scanner.next();

        System.out.println("Pick a value for Tuesday's temperature:");
        String strTue = scanner.next();

        System.out.println("Pick a value for Wednesday's temperature:");
        String strWed = scanner.next();

        System.out.println("Pick a value for Thursday's temperature:");
        String strThur = scanner.next();

        System.out.println("Pick a value for Friday's temperature:");
        String strFri = scanner.next();

        System.out.println("Pick a value for Saturday's temperature:");
        String strSat = scanner.next();

        int sun=Integer.parseInt(strSun);
        int mon=Integer.parseInt(strMon);
        int tue=Integer.parseInt(strTue);
        int wed=Integer.parseInt(strWed);
        int thur=Integer.parseInt(strThur);
        int fri=Integer.parseInt(strFri);
        int sat=Integer.parseInt(strSat);
        int avrg = ((sun + tue + wed + thur + fri + sat) / 7);

        System.out.println("\nSunday's temperature: " + sun + "\n\nMonday's temperature: " + mon + "\n\nTuesday's temperature: " + tue + "\n\nWednesday's temperature: " + wed + "\n\nThrusday's temperature: " + thur + "\n\nFriday's temperature: " + fri + "\n\nSaturday's temperature: " + sat + "\n\nWeekly Average temperature: " + avrg);
    }
}