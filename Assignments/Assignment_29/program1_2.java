/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
//  Function name:  Pattern
//  Description:    It is used to Display albhabets    
//  Input:          int
//  Author:         Atharva Sanjay Dhumal.
//  Date:           21/11/2025
//
/////////////////////////////////////////////////////////////////////////////
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0,iCount = 0;
    

        for(i = 1; i<= iRow;i++)
        {
            for(j =1,iCount =1; j<= iCol;j++,iCount++)
            {
                if((i%2) == 0)
                {
                    System.out.printf("%d\t",((iCount*2)-1));
                }
                else
                {
                    System.out.printf("%d\t",iCount*2);
                }
            }
            System.out.printf("\n");
        }
    }
}
/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of Rows:");
        iValue1= sobj.nextInt();

        
        System.out.println("Enter the Number of columns:");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);


    }
}
////////////////////////////////////////////////////////////////////////////////////
//
// Enter number of Rows:
// 5
// Enter number of Columns:
// 5
//  2       4       6       8       10
//  1       3       5       7       9
//  2       4       6       8       10
//  1       3       5       7       9
//  2       4       6       8       10
/////////////////////////////////////////////////////////////////////////////////////