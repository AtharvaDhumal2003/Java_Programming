import java.util.*;

class program1_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int CurrentStock = 0;
        int RequestedStock = 0;

        System.out.println("Enter the Current Stock : ");
        CurrentStock = sobj.nextInt();
        
        System.out.println("How much do you want : ");
        RequestedStock = sobj.nextInt();

        if(CurrentStock < 0 || RequestedStock < 0)
        {
            System.out.println("Inavlid Input");
            return;
        }

        if(RequestedStock > CurrentStock)
        {
            System.out.println("Oreder Failed : Insufficient Stock");
            return;
        }
        else 
        {
            System.out.println("Oreder placed Successfully.");
            CurrentStock = CurrentStock - RequestedStock;
            System.out.println("Remaining Stock : "+CurrentStock);
        }

        if(CurrentStock < 5)
        {
            System.out.println("Low Stock Alert !");
        }

        sobj.close();
    }
}
//////////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignment75>java program1_3.java
//Enter the Current Stock :
//450
//How much do you want :
//350
//Oreder placed Successfully.
//Remaining Stock : 100
//////////////////////////////////////////////////////////////////////////////