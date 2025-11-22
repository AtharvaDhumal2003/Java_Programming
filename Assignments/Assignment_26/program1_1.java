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
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt = 1; iCnt <= iNo;iCnt++,ch++)
        {
            System.out.print(ch+"\t");
        }
    }
}
/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter the Frequency:");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);


    }
}
////////////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input: 5    
//  output: A B C D E
//
/////////////////////////////////////////////////////////////////////////////////////