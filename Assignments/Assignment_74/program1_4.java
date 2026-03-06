import java.util.*;

class program1_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int Amount = 0;
        
        System.out.println("Enter the units used.");
        Units = sobj.nextInt();

        if( Units < 0)
        {
            System.out.println("Inavlid units.");
            return;
        }

        if(Units <= 100 )
        {
            Amount = Units * 5;
        }
        else if(Units <= 200 )
        {
            Amount = (Units * 7)-(100*2);
        }
        else if(Units > 200)
        {
            Amount = (Units * 10) - ((100 * 5) + (100 * 3));
        }

        System.out.println("Total units consumed: "+Units);
        System.out.println("Toatal Electricity bill: "+Amount);


        sobj.close();
    }
}