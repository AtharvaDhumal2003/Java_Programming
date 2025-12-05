/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   CpyReverseString
//  Description:    It used to cpyy the reverse the string.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public void CpyReverseString(String str)
    {

        int iCnt = 0, iCount = 0;

        char Arr[] = str.toCharArray();

        char[] reversed = new char[Arr.length];
       
        
        for(iCnt = (Arr.length - 1),iCount = 0; iCnt >= 0; iCnt--,iCount++)
        {
            reversed[iCount] = Arr[iCnt];
        }

        System.out.println(reversed);
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
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();


        STRINGX strobj = new STRINGX();
        strobj.CpyReverseString(sobj);
        
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Demo
//omeD
//Enter String:
//Marvellous
//suollevraM
//
/////////////////////////////////////////////////////////////////////////////////////