import java.util.*;

class program1_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0;
        int Charge = 0;

        System.out.println("Enter weight of your parcel:");
        Weight = sobj.nextInt();

        if(Weight < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Weight <= 1)
        {
            Charge = 50;
        }
        else if(Weight < 5)
        {
            Charge = 50 +((Weight - 1) * 20) ;
        }
        else if(Weight > 5)
        {
            Charge = 150 + ((Weight - 5) * 30);
        }

        System.out.println("Parcel Weight : "+Weight);
        System.out.println("Courier Charge : "+Charge);

        sobj.close();
   
    }
}
///////////////////////////////////////////////////////////////////////////////
///Enter weight of your parcel:
//15
//Parcel Weight : 15
//Courier Charge : 450
///////////////////////////////////////////////////////////////////////////////