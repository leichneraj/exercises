public class PayrollTester {
    
    public static void main(String[] args) {
        Employee e = new Employee("Johnathan", "Manager", 17.54, 36, 24000);
        Paycheck p = new Paycheck();

        System.out.println(e.getName() + " (" + e.getId() + "):");

    }

}
