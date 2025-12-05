/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   LastChar
// Description:     It gives the index of chracter in given string.
// Input:           string,character
// Output:          int
// Author:          Atharva Sanjay Dhumal.
// Date:            03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public int LastChar(String str,char ch)
    {

        int iCnt = 0, iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] == ch)
           {
               iCount = iCnt;
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

class program1_4
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        System.out.println("Enter Character:");
        char cobj = scanobj.next().charAt(0);

        STRINGX strobj = new STRINGX();
        iRet = strobj.LastChar(sobj,cobj);

        System.out.println("character found at index:"+iRet);

    
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Marvellous Multi os
//Enter Character:
//M
//character found at index:11
/////////////////////////////////////////////////////////////////////////////////////