import java.util.*;

class program1_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float Fare = 0.0f;

        System.out.println("Enter the distance : ");
        int Distance = sobj.nextInt();

        if(Distance < 0)
        {
            System.out.println("Invalid inout.");
            return;
        }

        System.out.println("Are you going between peak hours : (Yes/No)");
        String PeakHours = sobj.next();

        if(Distance <= 10)
        {
            Fare = 50 + (Distance * 12);
        }
        else if(Distance > 10)
        {
            Fare = 170 + ((Distance - 10) * 15);
        }

        if(PeakHours.equalsIgnoreCase("Yes"))
        {
            Fare = Fare + (Fare * 0.2f);
        }

        System.out.println("Distance : "+Distance+"KM");
        System.out.println("Peak Hour : "+PeakHours);
        System.out.println("Total Fare : "+Fare);

        sobj.close();
        
    }
}
/////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignment76>java program1_1.java
//Enter the distance :
//500
//Are you going between peak hours : (Yes/No)
//no
//Distance : 500KM
//Peak Hour : no
//Total Fare : 7520.0
/////////////////////////////////////////////////////////////////////////