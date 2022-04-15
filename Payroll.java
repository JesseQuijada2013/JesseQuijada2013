import java.util.Scanner;

class Payroll
{
   public static void main(String[] args)
   {
      caluclatePayroll();
         
   } // end main
   
//------------------------------------------------------------

   private static void caluclatePayroll()
   {
      Scanner scanner = new Scanner(System.in);
      
      double hoursWorked;
      double hourlyPay;
      double regularPay;
      double overtimeHours;
      double overtimePay;
      double overtimeFinalPay;
      double totalPaycheck;
      
      System.out.println("Enter the amount of hours (Not including OVERTIME) you worked for the week: ");
      hoursWorked = scanner.nextDouble();
      
      System.out.println("Enter the amount of OVERTIME hours you worked for the week: ");
      overtimeHours = scanner.nextDouble();
      
      System.out.println("Enter the your hourly pay: $ ");
      hourlyPay = scanner.nextDouble();
      
      regularPay = hoursWorked * hourlyPay;
      overtimePay = hourlyPay / 2 + hourlyPay;
      overtimeFinalPay = overtimePay * overtimeHours; 
      totalPaycheck = regularPay + overtimeFinalPay;
      
      System.out.println("Your paycheck before OVERTIME is: $" + regularPay);
      System.out.println("Your paycheck for OVERTIME is: $" + overtimeFinalPay);
      System.out.println("Your total paycheck is: $" + totalPaycheck);
      
      
      
   
   } // end method
   
} // end class