public class LunchAccount {
    
    private double bal;
    private int id;
    private String name;
    private static int studentCount = 1000;

    public LunchAccount(String name, double bal) {
        this.name = name;
        this.bal = bal;
        id = studentCount;
        studentCount++;
        if(id <= 1100) {
            this.bal = this.bal + 20.00;
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

    public void addBal(double addition) {
        this.bal = this.bal + addition;
    }

}
