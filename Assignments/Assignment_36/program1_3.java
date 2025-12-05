/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   strtoggleX
//  Description:    It use to convert small letters of given string into 
//                  capital letters.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public void strtoggleX(String str)
    {

        int iCnt = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
           {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
           }
           else if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
           {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
           }
        }

        System.out.print(Arr);
   
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
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        STRINGX strobj = new STRINGX();
        strobj.strtoggleX(sobj);
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Marvellous multi os
//mARVELLOUS MULTI OS
//
/////////////////////////////////////////////////////////////////////////////////////