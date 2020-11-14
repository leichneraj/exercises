public class LunchAccountTester {
    
    public static void main(String[] args) {
        LunchAccount joe = new LunchAccount("joe", 20.00); // Creates new student with an initial balance

        joe.addBal(10.00); // Adds 10.00 to total
        System.out.println(joe.getName() + " (" + joe.getId() + ") Balance: \n$" + joe.getBal()); // Expecting: joe (1000) Balance: $50.0

        System.out.println("\n" + joe.purchase(12.34));
        System.out.println(joe.getName() + " (" + joe.getId() + ") Balance: \n$" + joe.getBal()); // Expecting: joe (1000) Balance: $37.66

        System.out.println(joe.getData()); // Expecting: Spent since joining: $12.34 (\n) Lunches Bought: 1
    }
    
}