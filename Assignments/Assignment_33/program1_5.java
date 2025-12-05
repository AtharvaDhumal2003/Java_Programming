/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
///////////////////////////////////////////////////////////////////////////// 
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     CHARX
// Function name:   DisplaySchedule
//  Description:    It takes division from user and returns exam time.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class CHARX
{

    public void DisplaySchedule(char ch)
    {
        if(ch =='A' || ch == 'a')
        {
            System.out.println("Exam of Division A is at 7AM");
        }
        else if(ch == 'B' || ch == 'b')
        {
            System.out.println("Exam of Division B is at 8.30AM"); 
        }
        else if(ch == 'C' || ch == 'c')
        {
            System.out.println("Exam of Division C is at 9.20AM");
        }
        else if(ch == 'D' || ch == 'd')
        {
            System.out.println("Exam of Division D is at 10.30AM");
        }
        else
        {
            System.out.println("Enter corret division");
        }
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
        cobj.DisplaySchedule(cValue);

    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter the character:
//A
//Exam of Division A is at 7AM
//
//Enter the character:
//q
//Enter corret division
/////////////////////////////////////////////////////////////////////////////////////