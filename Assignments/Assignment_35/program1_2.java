/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   countSmall
//  Description:    It used to count small lettsers in given string.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public int CountSmall(String str)
    {

        int iCnt = 0,iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
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

class program1_2
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        STRINGX strobj = new STRINGX();
        iRet = strobj.CountSmall(sobj);

        System.out.println("Number of small characters are :"+iRet);
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Marvellous
//Number of small characters are :9
//
//Enter String:
//atharva
//Number of small characters are :7
//
/////////////////////////////////////////////////////////////////////////////////////