/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     CHARX
// Function name:   Display
//  Description:    It use to display capital letter of given input 
//                  small letter and viceversa.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/11/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{

    public void Display(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - 32);
            System.out.println(ch);
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            ch = (char)(ch + 32);
           System.out.println(ch);
        }
        else
        {
            System.out.println(ch);
        }
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


        System.out.println("Enter the character:");
        cValue = sobj.next().charAt(0);

        CHARX cobj = new CHARX();
        cobj.Display(cValue);

    }
}

////////////////////////////////////////////////////////////////////////////////////
//
//Enter the character:
//a
//A
//Enter the character:
//$
//$
//Enter the character:
//Z
//z
/////////////////////////////////////////////////////////////////////////////////////