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
        int i = 0, j = 0;
        for(i = 1; i<= iRow; i++)
        {
            for(j =1;j<=iCol;j++)
            if(i <= j)
            {
                System.out.print(j+"\t");
            }
            else
            {
                System.out.print(" \t");
            }
            System.out.println();
        }
    }
}
/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_5
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
//Enter the number of Rows:
//6
//Enter the Number of columns:
//6
//1       2       3       4       5       6
//        2       3       4       5       6
//                3       4       5       6
//                        4       5       6
//                                5       6
//                                        6
/////////////////////////////////////////////////////////////////////////////////////