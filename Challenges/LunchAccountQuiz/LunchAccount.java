import java.text.DecimalFormat;

public class LunchAccount {
    
    private double bal, lifetimeSpent;
    private int id, lunchesBought;
    private String name;
    private static int studentCount = 0;

    public LunchAccount(String name, double bal) {
        this.name = name;
        this.bal = bal;
        id = studentCount + 1000;
        studentCount++;
        if(id <= 1100) {
            this.bal = this.bal + 20.00;
        }
    }

    public String purchase(double amount) {
        DecimalFormat rounded = new DecimalFormat("###.##");
        this.bal = this.bal - amount;
        if(this.bal < 0 ) {
            this.bal = this.bal + amount;
            return "Insufficient funds, purchase denied. Needs " + rounded.format(-1 * (this.bal - amount)) + " more.";
        } else {
            lifetimeSpent = lifetimeSpent + amount;
            lunchesBought++;
            return "Transaction completed.";
        }
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public double getBal() {
        return this.bal;
    }

    public String getData() {
        return ("\nSpent since joining: $" + lifetimeSpent + "\nLunches bought: " + lunchesBought);
    }

    public void addBal(double addition) {
        this.bal = this.bal + addition;
    }

}
