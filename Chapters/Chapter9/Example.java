public class Example
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked;    
    double payRate, taxRate;

    hoursWorked = 40;
    payRate = 10.0;
    taxRate = 0.1;
    
    System.out.println("Hours Worked : " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}