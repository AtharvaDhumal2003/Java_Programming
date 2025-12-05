/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   strCpyX
//  Description:    It use to copy input string by removing white spaces.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public void strCpyX(String str)
    {

        int iCnt = 0;

        char Arr[] = str.toCharArray();

        char[] reversed = new char[Arr.length];
       
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ' ')
            {
                iCnt++;
            }
            reversed[iCnt] = Arr[iCnt];
        }

        System.out.println(reversed);
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
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();


        STRINGX strobj = new STRINGX();
        strobj.strCpyX(sobj);
        
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Demo obj
//Demoobj
//
/////////////////////////////////////////////////////////////////////////////////////