import java.util.*;

class program1_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your budget : ");
        int Budget = sobj.nextInt();

        System.out.println("Number of items you want to Buy  : ");
        int Items = sobj.nextInt();

        if(Budget < 0 || Items < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Prices[] = new int[Items];

        int i = 0;
        int iSum = 0;

        for(i = 0; i < Prices.length; i++)
        {
            System.out.println("Enter the price of Item "+(i+1));
            Prices[i] = sobj.nextInt();
            if(Prices[i] < 0)
            {
                System.out.println("Invalid Input");
                break;
            }
            iSum = iSum + Prices[i];
        }

        if(i < (Items-1))
        {
            return;
        }

        /*    
        if((Budget - iSum) < 0)
        {
            System.out.println("Your budget is low for this much items");
            return;
        }
        */

        System.out.println("Item Purchased : "+Items);
        System.out.println("Remaining Balance : "+(Budget - iSum));

        sobj.close();
   
    }
}
//////////////////////////////////////////////////////////////////////////////////
/////Enter your budget :
//3500
//Number of items you want to Buy  :
//8
//Enter the price of Item 1
//560
//Enter the price of Item 2
//450
//Enter the price of Item 3
//87
//Enter the price of Item 4
//670
//Enter the price of Item 5
//340
//Enter the price of Item 6
//230
//Enter the price of Item 7
//590
//Enter the price of Item 8
//60
//Item Purchased : 8
//Remaining Balance : 513
//////////////////////////////////////////////////////////////////////////////////