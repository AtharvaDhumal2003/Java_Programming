import java.util.*;

class program1_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int MonthlyIncome = 0;
        int CreditScore = 0;

        String UnpaidLoan = null;

        System.out.println("Please enter your Age : ");
        Age = sobj.nextInt();

        System.out.println("Please enter your Monthly Income : ");
        MonthlyIncome = sobj.nextInt();

        System.out.println("Please enter your Credit Score : ");
        CreditScore = sobj.nextInt();

        System.out.println("Do you have any unpaidloan : ");
        UnpaidLoan = sobj.next();

        if
        (
            Age < 0 || 
            CreditScore < 0 || 
            MonthlyIncome < 0 || 
            ((UnpaidLoan.equalsIgnoreCase("Yes") == false) && 
            (UnpaidLoan.equalsIgnoreCase("No") == false))
        )
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(UnpaidLoan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected : As you have unpaid Loan.");
            return;
        }

        if(Age < 20 || Age > 60)
        {
            System.out.println("Loan Rejected : As you are age is not eligible.");
            return;
        }
        else if(MonthlyIncome < 25000)
        {
            System.out.println("Loan Rejected : As your monthly income is below 25000.");
            return;
        }
        else if(CreditScore < 700)
        {
            System.out.println("Loan Rejected : As your Credit Score is low.");
            return;
        }
        else
        {
            System.out.println("Loan Approved");
        }


        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////
///Please enter your Age :
//34
//Please enter your Monthly Income :
//40000
//Please enter your Credit Score :
//345
//Do you have any unpaidloan :
//no
//Loan Rejected : As your Credit Score is low.
/////////////////////////////////////////////////////////////////////////////////////