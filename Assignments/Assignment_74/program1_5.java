import java.util.*;

class program1_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;
        String MembershipType = null; 
        float DiscountAmount = 0.0f;
        float FinalAmount = 0.0f;

        System.out.println("Enter purchase amount : ");
        Amount = sobj.nextInt();

        System.out.println("Enter membership type : (Premium/Regular)");
        MembershipType = sobj.next();

        if
        (
            (Amount < 0 ) ||
            ((MembershipType.equalsIgnoreCase("Premium") == false) &&
            (MembershipType.equalsIgnoreCase("Regular") == false))
        )
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Amount > 5000)   //20 % discount
        {
            DiscountAmount = ((float)Amount * (0.20f));
            FinalAmount = (float)Amount - DiscountAmount;
        }
        else if(Amount > 2000)          //10%
        {
            DiscountAmount = ((float)Amount * (0.10f));
            FinalAmount = (float)Amount - DiscountAmount;
        }
        else                //0%
        {
            DiscountAmount = 0.0f;
            FinalAmount = Amount;
        }

        if(MembershipType.equalsIgnoreCase("Premium"))
        {
            DiscountAmount = DiscountAmount + (FinalAmount * 0.05f);
            FinalAmount = Amount - DiscountAmount;
        }

        System.out.println("Original Amount : "+Amount);
        System.out.println("Total Discount : "+DiscountAmount);
        System.out.println("Final Amount : "+FinalAmount);

        


        sobj.close();
    }
}