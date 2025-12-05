/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   chkChar
// Description:     It use to check given character is present in string or 
//                  not.
// Input:           string,character
// Output:          Boolean
// Author:          Atharva Sanjay Dhumal.
// Date:            03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public Boolean chkChar(String str,char ch)
    {

        int iCnt = 0;
        Boolean bFlag = false;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] == ch)
           {
                bFlag = true;
                break;
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

class program1_1
{
    public static void main(String A[])
    {
        Boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        System.out.println("Enter Character:");
        char cobj = scanobj.next().charAt(0);

        STRINGX strobj = new STRINGX();
        bRet = strobj.chkChar(sobj,cobj);

        if(bRet == true)
        {
            System.out.println("Cahracter found.");
        }
        else
        {
            System.out.println("Cahracter not found.");
        }
    
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//demo
//Enter Character:
//d
//Cahracter found.
/////////////////////////////////////////////////////////////////////////////////////