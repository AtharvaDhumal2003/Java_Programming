/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   countDiff
//  Description:    It used to calculate diffrennce between number of small 
//                  characters and capital characters.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public int CountDiff(String str)
    {

        int iCnt = 0,iSCount = 0, iCCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
           {
                iSCount++;
           }
           else if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
           {
                iCCount++;
           }
        }

        return (iSCount - iCCount);   
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
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        STRINGX strobj = new STRINGX();
        iRet = strobj.CountDiff(sobj);

        System.out.println("Difference between small and capital chracters is :"+iRet);
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//MarvellouS
//Difference between small and capital chracters is :6
//
//Enter String:
//AtharvA
//Difference between small and capital chracters is :3
/////////////////////////////////////////////////////////////////////////////////////