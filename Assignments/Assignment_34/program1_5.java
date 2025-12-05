/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     CHARX
// Function name:   Display
//  Description:    It use to display given characters decimal,hexadecimal
//                  and octal value according to ASCII table.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{

    public void Display(char ch)
    {
            System.out.printf("Decimal:%d\n",(int)ch);
            System.out.printf("Hexadecimal:%#X\n",(int)ch);
            System.out.printf("Octal:%o\n",(int)ch);
            System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_5
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
///Enter the character:
//c
//Decimal:99
//Hexadecimal:0X63
//Octal:143
/////////////////////////////////////////////////////////////////////////////////////