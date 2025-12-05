/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     CHARX
// Function name:   DisplaySchedule
//  Description:    It used to display ascii table from 0 to 255.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{

    public void Display()
    {
        char ch = '\0';
        
        for(ch = '\0'; ch <= 'ÿ';ch++)
        {
            System.out.printf("|Symbol:%c|\t",ch);
            System.out.printf("|Decimal:%d|\t",(int)ch);
            System.out.printf("|Hexadecimal:%#X|\t",(int)ch);
            System.out.printf("|Octal:%o|\t",(int)ch);
            System.out.println();
        }
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
        CHARX cobj = new CHARX();
        cobj.Display();
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//|Symbol:=|      |Decimal:61|    |Hexadecimal:0X3D|      |Octal:75       |
//|Symbol:>|      |Decimal:62|    |Hexadecimal:0X3E|      |Octal:76       |
//|Symbol:?|      |Decimal:63|    |Hexadecimal:0X3F|      |Octal:77       |
//|Symbol:@|      |Decimal:64|    |Hexadecimal:0X40|      |Octal:100      |
//|Symbol:A|      |Decimal:65|    |Hexadecimal:0X41|      |Octal:101      |
//|Symbol:B|      |Decimal:66|    |Hexadecimal:0X42|      |Octal:102      |
//|Symbol:C|      |Decimal:67|    |Hexadecimal:0X43|      |Octal:103      |
//|Symbol:D|      |Decimal:68|    |Hexadecimal:0X44|      |Octal:104      |
/////////////////////////////////////////////////////////////////////////////////////