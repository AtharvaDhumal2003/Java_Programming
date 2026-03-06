import java.util.*;

class program1_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float Bill = 0.0f, LateFee = 0.0f;

        System.out.println("Enter the units used : ");
        int Units = sobj.nextInt();

        System.out.println("How many weekslate : ");
        int Weeks = sobj.nextInt();

        if(Units < 0 || Weeks < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Units <= 100)
        {
            Bill = Units * 5;
        }
        else if(Units <= 200)
        {
            Bill = 500 + ((Units - 100) * 10);
        }
        else if(Units <= 300)
        {
            Bill = 500 + 1000 +((Units - 200) * 15) ;
        }
        else if(Units > 300)
        {
            Bill = 3000 + ((Units - 300) * 20);
        }

        if(Weeks <= 5)
        {
            LateFee = Bill * ((float)Weeks * 0.02f);  
        }
        else
        {
            LateFee = Bill * 0.1f;
        }

        Bill = Bill + LateFee;
        
        System.out.println("BillAmount : "+Bill);

        sobj.close();

    }
}
////////////////////////////////////////////////////////////////////////
///C:\Users\athar\Desktop\LBA\Assignment77>java program1_4.java
//Enter the units used :
//350
//How many weekslate :
//2
//BillAmount : 4160.0
////////////////////////////////////////////////////////////////////////
