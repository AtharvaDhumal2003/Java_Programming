/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   FirstChar
// Description:     It gives the index of chracter in given string.
// Input:           string,character
// Output:          int
// Author:          Atharva Sanjay Dhumal.
// Date:            03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public int FirstChar(String str,char ch)
    {

        int iCnt = 0, iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] == ch)
           {
               iCount = iCnt;
               break;
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

class program1_3
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
        iRet = strobj.FirstChar(sobj,cobj);

        System.out.println("character found at index:"+iRet);

    
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Ganpati Bappa Morya
//Enter Character:
//a
//character found at index:1
/////////////////////////////////////////////////////////////////////////////////////