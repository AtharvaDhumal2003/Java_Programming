/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     CHARX
// Function name:   CkkSmall
//  Description:    It use to check input is small or not.   
//  Input:          char
//  Output:         Boolean
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{
    Boolean bFlag = false;
    public Boolean ChkSmall(char ch)
    {
        if(ch >='a' && ch <= 'z')
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
class program1_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        char cValue = '\0';
        Boolean bRet = false;

        System.out.println("Enter the character:");
        cValue = sobj.next().charAt(0);

        CHARX cobj = new CHARX();
        bRet = cobj.ChkSmall(cValue);

        if(bRet == true)
        {
            System.out.println("It is a small letter.");
        }
        else
        {
            System.out.println("It is not a small letter.");
        }


    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter the character:
//a
//It is a small letter.
//
//Enter the character:
//A
//It is not a small letter.
//
////////////////////////////////////////////////////////////////////////////////////