/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   displayDigit
//  Description:    It use to display digits in given string.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public void displayDigit(String str)
    {

        int iCnt = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] >= '0' && Arr[iCnt] <= '9')
           {
                System.out.print(Arr[iCnt]);
           }
          
        }
   
    }
}
/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        STRINGX strobj = new STRINGX();
        strobj.displayDigit(sobj);
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//mavell2312ous
//2312
//
/////////////////////////////////////////////////////////////////////////////////////