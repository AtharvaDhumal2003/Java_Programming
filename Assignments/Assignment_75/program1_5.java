import java.util.*;

class program1_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        float Tax = 0.0f;

        System.out.println("Please enter your income");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Invalid Input");
            return;
        }    

        if(Income <= 250000)
        {
            Tax = ((float)Income * 0.0f);
        }
        else if(Income <= 500000)
        {
            Tax = ((float)(Income - 250000) * 0.05f);
        }
        else if(Income <= 1000000)
        {
            Tax = ((float)(Income - 500000) * 0.2f) + ((float)250000 * 0.05f) ;
        }
        else if(Income > 1000000)
        {
            Tax = ((float)(Income - 500000) * 0.3f) + ((float)250000 * 0.05f) +((float)250000 * 0.2f);
        }

        System.out.println("Total Income : "+Income);
        System.out.println("Total Payable Tax : "+Tax);

        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////
///Please enter your income
//450000
//Total Income : 450000
//Total Payable Tax : 10000.0
///////////////////////////////////////////////////////////////////////////