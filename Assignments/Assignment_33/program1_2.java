/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     CHARX
// Function name:   ChkCapital
//  Description:    It use to check input is capital or not.   
//  Input:          char
//  Output:         Boolean
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{
    Boolean bFlag = false;
    public Boolean ChkCapital(char ch)
    {
        if(ch >='A' && ch <= 'Z')
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
class program1_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        char cValue = '\0';
        Boolean bRet = false;

        System.out.println("Enter the character:");
        cValue = sobj.next().charAt(0);

        CHARX cobj = new CHARX();
        bRet = cobj.ChkCapital(cValue);

        if(bRet == true)
        {
            System.out.println("It is a capital letter.");
        }
        else
        {
            System.out.println("It is not a Capital letter.");
        }


    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter the character:
//A
//It is a capital letter.
//Enter the character:
//e
//It is not a Capital letter.
/////////////////////////////////////////////////////////////////////////////////////