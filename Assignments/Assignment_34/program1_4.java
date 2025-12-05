/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
//  Class Name :    CHARX
//  Function name:  Display
//  Description:    It use to check given input is special character or not.   
//  Input:          char
//  Output:         Boolean
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{

    public Boolean Display(char ch)
    {
        Boolean bFlag = false;
        if((ch == '!') ||( ch == '@') || (ch == '$') || (ch == '%') 
           || (ch == '^') || (ch == '&') || (ch == '*'))
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
        bRet =  cobj.Display(cValue);

        if(bRet == true)
        {
            System.out.println("It is Special Cahracter");
        }
        else
        {
            System.out.println("It is not a Special Cahracter"); 
        }

    }
}

////////////////////////////////////////////////////////////////////////////////////
//
//Enter the character:
//%
//It is Special Cahracter
//
//Enter the character:
//A
//It is not a Special Cahracter
//
/////////////////////////////////////////////////////////////////////////////////////