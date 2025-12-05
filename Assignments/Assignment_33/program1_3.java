/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     CHARX
// Function name:   chkDigit
//  Description:    It use to check input is digit or not.   
//  Input:          char
//  Output:         Boolean
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{
    Boolean bFlag = false;
    public Boolean ChkDigit(char ch)
    {
        if(ch >= '0' && ch <= '9')
        {
            bFlag = true;
        }
        else
        {
            bFlag = false;
        }

        return bFlag;
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
        Scanner sobj = new Scanner(System.in);
        
        char cValue = '\0';
        Boolean bRet = false;

        System.out.println("Enter the character:");
        cValue = sobj.next().charAt(0);

        CHARX cobj = new CHARX();
        bRet = cobj.ChkDigit(cValue);

        if(bRet == true)
        {
            System.out.println("It is a digit.");
        }
        else
        {
            System.out.println("It is not a digit.");
        }


    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter the character:
//1
//It is a digit.
//
//Enter the character:
//#
//It is not a digit.
//Enter the character:
//a
//It is not a digit.
/////////////////////////////////////////////////////////////////////////////////////