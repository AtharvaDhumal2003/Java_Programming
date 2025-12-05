/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     StrCpyCap
// Function name:   ReverseString
//  Description:    It used to copy string by converting characters small 
//                  to Capital.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public void StrCpyCap(String str)
    {

        int iCnt = 0;

        char Arr[] = str.toCharArray();

        char[] reversed = new char[Arr.length];
       
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
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

class program1_3
{
    public static void main(String A[])
    {
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();


        STRINGX strobj = new STRINGX();
        strobj.StrCpyCap(sobj);
        
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Ganpati bappa morya
//GANPATI BAPPA MORYA
//
/////////////////////////////////////////////////////////////////////////////////////