public class LunchAccountTester {
    
    public static void main(String[] args) {
        LunchAccount joe = new LunchAccount("joe", 20.00); // Creates new student with an initial balance

        joe.addBal(10.00); // Adds 10.02 to total
        System.out.println(joe.getName() + " (" + joe.getId() + ") Balance: \n$" + joe.getBal()); // Expecting: joe (1000) Balance: $50.0
    }
    
}
