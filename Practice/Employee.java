public class Employee {
    int hoursInPayroll, lifetimeHours, id;
    double pay;
    String name, position;

    public Employee(String name, String position, double pay, int hoursInPayroll, int lifetimeHours) {

        this.name = name;
        this.position = position;
        this.pay = pay;
        this.hoursInPayroll = hoursInPayroll;
        this.lifetimeHours = lifetimeHours;
        this.id = id + 1;
        
    }

    public int getId() {

        return this.id;

    }

    public String getName() {

        return this.name;

    }

    public String getPosition() {

        return this.position;

    }

    public double getPay() {

        return this.pay;

    }

    public int getHoursInPayroll() {

        return this.hoursInPayroll;

    }

    public int getLifetimeHours() {

        return this.lifetimeHours;

    }

}