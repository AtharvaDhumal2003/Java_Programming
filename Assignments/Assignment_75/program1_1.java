import java.util.*;

class program1_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Hours = 0;
        int Fees = 0;

        System.out.println("Enter the hours: ");
        Hours = sobj.nextInt();

        if(Hours < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Hours <= 2)
        {
            Fees = Hours * 20;
        }
        else if(Hours > 2 && Hours <= 10)
        {
            Fees = 40 + ((Hours - 2) * 10);
        }

        if(Hours > 10)
        {
            Fees = (40 + 80) + ((Hours - 10) * 50);
        }

        System.out.println("Total Parking Duration : "+Hours+" hours");
        System.out.println("Total Parking fees : "+Fees);

        sobj.close();
    }
}
//////////////////////////////////////////////////////////////////////
///:\Users\athar\Desktop\LBA\Assignment75>java program1_1.java
//Enter the hours:
//7
//Total Parking Duration : 7 hours
//Total Parking fees : 90
//////////////////////////////////////////////////////////////////////