/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   countDiff
//  Description:    It used to check whether given string contains vowel or 
//                  not.   
//  Input:          char
//  Output:         Boolean
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public Boolean ChkVowels(String str)
    {
        int iCnt = 0;
        Boolean bFlag = false;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] == 'a' || (Arr[iCnt] == 'e') || (Arr[iCnt] == 'i') || (Arr[iCnt] == 'o') || (Arr[iCnt] == 'u') ||
              (Arr[iCnt] == 'A') || (Arr[iCnt] == 'E') || (Arr[iCnt] == 'I') || (Arr[iCnt] == 'O') || (Arr[iCnt] == 'U') )
           {
                bFlag = true;
           }
           else
           {
                bFlag = false;
           }
        }

        return bFlag;   
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
        Boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        STRINGX strobj = new STRINGX();
        bRet = strobj.ChkVowels(sobj);

        if(bRet == true)
        {
            System.out.println("It contain a vowel.");
        }
        else
        {
            System.out.println("It do not contain a vowel.");
        }
   
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//marvellous
//It do not contain a vowel.
//
//Enter String:
//xty
//It do not contain a vowel.
/////////////////////////////////////////////////////////////////////////////////////