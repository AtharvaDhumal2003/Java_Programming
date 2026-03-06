import java.util.*;

class program1_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your current balance:");
        int Current_Balance = sobj.nextInt();

        
        System.out.println("Please enter the amount that you want to withdraw:");
        int Withdraw_Amount = sobj.nextInt();

        if(Current_Balance < 0 || Withdraw_Amount <= 0)
        {
            System.out.println("Invalid input.");
            return;
        }

        if(Withdraw_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed: Withdral amount must be a multiple of 100.");
        }
        else if(Withdraw_Amount > 25000)
        {
           System.out.println("Transaction Failed: Maximum withdral per transaction 25,000"); 
        }
        else if(Current_Balance - Withdraw_Amount < 1000)
        {
            System.out.println("Transaction Failed: After withdrawl , balance must remain at least 1,000.");
        }
        else
        {
            System.out.println("Transaction successful.");
            System.out.println("Remaining balance: "+(Current_Balance-Withdraw_Amount));
        }



    }
}