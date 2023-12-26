import java.util.Scanner;
//soalan1
public class Main20 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put in customer name: ");
        String name = scanner.nextLine();
        System.out.println("Please put in account number: ");
        long accnum = scanner.nextLong();
        System.out.println("Please put in payment: ");
        double payment = scanner.nextDouble();

        Customer customer = new Customer(name, accnum);
        Deposit deposit = new Deposit(accnum, payment);

        System.out.println("\nAccount number is: " + customer.getAcc());
        System.out.println("Customer name is: " + customer.getName());
        System.out.println("Payment is: RM" + deposit.getPay() + ".0");
    }
}
class Bank 
{
    private long accnum;
    private String name;

    public Bank(String name, long accnum) 
    {
        this.name = name;
        this.accnum = accnum;
    }

    public long getAcc() 
    {
        return accnum;
    }

    public String getName() 
    {
        return name;
    }
}

class Customer extends Bank 
{
    public Customer(String name, long accnum) 
    {
        super(name, accnum);
    }
}

class Deposit extends Bank 
{
    private double payment;

    public Deposit(long accnum, double payment) 
    {
        super("", accnum);
        this.payment = payment;
    }

    public double getPay() 
    {
        return payment;
    }
}
