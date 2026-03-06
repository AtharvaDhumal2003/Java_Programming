import java.util.*;

class program1_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int BaseFare = 0 ,ClassPrice = 0;
        float FinalPrice = 0.0f, Tatkal = 0.0f, Discount = 0.0f;


        System.out.println("Enter the distance : ");
        int Distance = sobj.nextInt();

        if(Distance < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Enter your class : ");
        String Class = sobj.next();

        if
        (
            Class.equalsIgnoreCase("Sleeper") == false &&
            Class.equalsIgnoreCase("3AC") == false &&
            Class.equalsIgnoreCase("2AC")  == false
        )
        {
            System.out.println("Invalid Input.");
            return;
        }

        System.out.println("Enter Booking Hours : ");
        int Hours = sobj.nextInt();

        if(Hours < 0)
        {
            System.out.println("Invalid Input");
            return; 
        }
        
        System.out.println("Enter your Age : ");
        int Age = sobj.nextInt();

        if(Age < 0)
        {
            System.out.println("Invalid Input");
            return; 
        }

        if(Distance < 500)
        {
            BaseFare = 500;
        }
        else
        {
            BaseFare = 1000;
        }

        if(Class.equalsIgnoreCase("Sleeper"))
        {
            ClassPrice = 800;
        }
        else if(Class.equalsIgnoreCase("3AC"))
        {
            ClassPrice = 1200;
        }
        else if(Class.equalsIgnoreCase("2AC"))
        {
            ClassPrice = 1500;
        }

        FinalPrice = BaseFare + ClassPrice;

        if(Hours < 24)
        {
            Tatkal = (((float)BaseFare + (float)ClassPrice) * 0.3f);
            FinalPrice = FinalPrice + Tatkal;
        }

        if(Age >= 70)
        {
            Discount = ((((float)BaseFare + (float)ClassPrice)) * 0.4f);
            FinalPrice = FinalPrice - Discount;
        }

        System.out.println("Final payable price : "+FinalPrice);
        System.out.println("PriceBreakdown : ");
        System.out.println("BaseFare : "+BaseFare);
        System.out.println("ClassPrice : "+ClassPrice);
        if(Tatkal > 0.0f)
        {
            System.out.println("Tatkal Booking Charge : "+Tatkal);
        }
        
        if(Discount > 0.0f)
        {
            System.out.println("Senior citizen discount : "+Discount);
        }
        
    }
}
//////////////////////////////////////////////////////////////
/////C:\Users\athar\Desktop\LBA\Assignment77>java program1_2.java
//Enter the distance :
//500
//Enter your class :
//2Ac
//Enter Booking Hours :
//23
//Enter your Age :
//56
//Final payable price : 3250.0
//PriceBreakdown :
//BaseFare : 1000
//ClassPrice : 1500
//Tatkal Booking Charge : 750.0
//////////////////////////////////////////////////////////////