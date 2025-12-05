/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     CHARX
// Function name:   Display
//  Description:    It use to display letters from given letter to z.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{

    public void Display(char ch)
    {
        char ch1 = '\0';

        if(ch >= 'a' && ch <= 'z')
        {
            for(ch1 = ch; ch1 <= 'z';ch1++)
            {
                System.out.print(ch1+"\t");
            }
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            for(ch1 = ch; ch1 >= 'A';ch1--)
            {
                System.out.print(ch1+"\t");
            }
        }
        else
        {
            System.out.println(" ");
        }
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


        System.out.println("Enter the character:");
        cValue = sobj.next().charAt(0);

        CHARX cobj = new CHARX();
        cobj.Display(cValue);

    }
}

////////////////////////////////////////////////////////////////////////////////////
//
//Enter the character:
//F
// F       E       D       C       B       A
//
//Enter the character:
//s
//s       t       u       v       w       x       y       z
//Enter the character:
//@
//
/////////////////////////////////////////////////////////////////////////////////////