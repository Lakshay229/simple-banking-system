import java.util.Scanner;

public class Bank 
{
    static Scanner mkc;
    static int no3=100000;    
    static int no5;
    int number()
    {
        System.out.println("Please enter your account number");
        int no1=mkc.nextInt();
        
        return no1;
    }
     void savings()
    {
        Bank mc = new Bank();
        int no1 = number();
        System.out.println("your bank account number is : "+no1);
        System.out.println("Your name is Lakshay");
        
        
        mkc = new Scanner(System.in);
        System.out.println("What do you want to do?\n1. Deposit\n2. Withdraw\n3. Check Balance");
        
        String func = mkc.next();

        switch(func)    
        {
            case "1": mc.deposit();
            break;

            case "2": mc.withdraw();
            break;

            case "3": mc.balance();
            break;

            default:System.out.println("invalid input");
            break;
        }
    }
    void checking()
    {
        int no1 = number();
        System.out.println("your bank account number is : "+no1);
        System.out.println("Your name is Lakshay");
        Bank mc = new Bank();
        
        mkc = new Scanner(System.in);
        System.out.println("What do you want to do?\n1. Deposit\n2. Withdraw\n3. Check Balance");
        
        String func = mkc.next();

        switch(func)
        {
            case "1": mc.deposit();
            break;

            case "2": mc.withdraw();
            break;

            case "3": mc.balance();
            break;
            
            default:System.out.println("invalid input");
            break;
        }

    }
    int deposit()
    {
        System.out.println("Please enter the amount you want to deposit");
        int no4=mkc.nextInt();

         System.out.println("Your current balance is : "+(no3+no4));
         int no5 = (no3+no4);
        
         
         return no5;
         
    }
    int withdraw()
    {
        System.out.println("Please enter the amount you want to withdraw");
        int no4=mkc.nextInt();

         int no5 = (no3-no4);
         if(no5<0)
         {
            System.out.println("You don't have enough balance");
         }
         if(no5>0)
         {
             System.out.println("Your current balance is : "+(no3-no4));
         }
        
        
         return no5; 
    }
    
    
    void balance()
    {
        System.out.println("Your balance is"+no3);
    }
    public static void main(String[] args) 
    {
        
        Bank bc = new Bank();
        mkc = new Scanner(System.in);
        String str;
        
        do
        {
            System.out.println("which bank account do you have ?\n1. Savings Account\n2. Checking Account");

            String input = mkc.next();

        
            switch(input)
            {
                case "1": bc.savings();
                break;

                case "2": bc.checking();
                break;

                default:System.out.println("invalid input");
                break;
            }

            
            System.out.println("Do you want to continue, if yes then press y otherwise any key");
            str = mkc.next();
        }while(str.equals("y"));
        
    }
    
}
