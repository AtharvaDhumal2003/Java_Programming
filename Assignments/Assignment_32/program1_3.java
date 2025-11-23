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
        if(iRow != iCol)
        {
            System.out.println("Number of Rows and Columns must be same.");
            return;
        }

        for(i = 1; i<= iRow; i++)
        {
            for(j =1; j<= iCol; j++)
            {
                if((i + j) == (iRow+1)|| i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
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
class program1_3
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
//5
//Enter the Number of columns:
//5
//*       *       *       *       *
//*                       *       *
//*               *               *
//*       *                       *
//*       *       *       *       *
/////////////////////////////////////////////////////////////////////////////////////