import java.util.*;

class program1_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalCost = 0;
        String PlanType = null;

        System.out.println("Enter your monthly miniutes : (0 - 4000) ");
        int Miniutes = sobj.nextInt();

        System.out.println("Enter your monthly data usage : (15gb - 240gb)");
        int Data = sobj.nextInt();
        
        System.out.println("Enter your monthly SMS : (1000 - 12000) ");
        int Sms = sobj.nextInt();

        if(Miniutes < 0 || Data < 15 || Sms < 1000)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Miniutes < 300)
        {
            TotalCost = 100;
        }
        else if(Miniutes < 1000)
        {
            TotalCost = 200;
        }
        else if(Miniutes < 3000)
        {
            TotalCost = 300;
        }
        else if(Miniutes < 4000)
        {
            TotalCost = 400;
        }


        if(Data >= 15 && Data <= 30 )
        {
            TotalCost = TotalCost + 150;
        }
        else if(Data > 30 && Data <= 60)
        {
            TotalCost = TotalCost + 200;
        }
        else if(Data > 60 && Data <= 150)
        {
            TotalCost = TotalCost + 250;
        }
        else if(Data >150 && Data <= 240)
        {
            TotalCost = TotalCost + 300;
        }

        if(Sms >=1000 && Sms <= 3000)
        {
            TotalCost = TotalCost + 50;
        }
        else if(Sms > 3000 && Sms <= 6000)
        {
            TotalCost = TotalCost + 100;
        }
        else if(Sms > 6000 && Sms <= 9000)
        {
            TotalCost = TotalCost + 150;
        }
        else if(Sms > 9000 && Sms <= 12000)
        {
            TotalCost = TotalCost + 200;
        }
        
        if (TotalCost <= 250) 
        {
            PlanType = "Basic Saver";
        }
        else if (TotalCost > 250 && TotalCost <= 450) 
        {
            PlanType = "Standard Bundle";
        }
        else if (TotalCost > 450 && TotalCost <= 600) 
        {
            PlanType = "Premium Combo";
        }
        else if (TotalCost > 600) 
        {
            PlanType = "Elite Unlimited";
        }


        System.out.println("Recomended plan : "+PlanType);
        System.out.println("Total Cost : "+TotalCost);

        sobj.close();
    }
        
}
//////////////////////////////////////////////////////////////////
///C:\Users\athar\Desktop\LBA\Assignment77>java program1_3.java
//Enter your monthly miniutes : (0 - 4000)
//2500
//Enter your monthly data usage : (15gb - 240gb)
//60
//Enter your monthly SMS : (1000 - 12000)
//8000
//Recomended plan : Elite Unlimited
//Total Cost : 650
//////////////////////////////////////////////////////////////////