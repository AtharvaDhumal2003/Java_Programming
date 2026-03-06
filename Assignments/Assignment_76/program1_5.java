import java.util.*;

class program1_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Battery percentage : ");
        int Battery = sobj.nextInt();

        String Status = null;

        if(Battery < 0 || Battery > 100)
        {
            System.out.println("Inavlid Input.");
            return;
        }

        if(Battery <= 5)
        {
            Status = "Criticle";
        }
        else if(Battery <= 15)
        {
            Status = "Low";
        }
        else
        {
            Status = "Normal";
        }

        System.out.println("Battery Percentage : "+Battery);
        System.out.println("Status : "+Status);

        sobj.close();
   
    }
}
///////////////////////////////////////////////////////////////////////////
///Enter your Battery percentage :
//50
//Battery Percentage : 50
//Status : Normal
///////////////////////////////////////////////////////////////////////////