/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   CountWhite
//  Description:    It use to display digits in given string.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public int CountWhite(String str)
    {

        int iCnt = 0, iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] == ' ')
           {
                iCount++;
           } 
        }

        return iCount;
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
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        STRINGX strobj = new STRINGX();
        iRet = strobj.CountWhite(sobj);

        System.out.println("Number of white spaces are:"+iRet);
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Ganpati Bappa Morya
//Number of white spaces are:2
/////////////////////////////////////////////////////////////////////////////////////