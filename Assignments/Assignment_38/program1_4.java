/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   StrCpySmall
//  Description:    It used to copy string by converting characters capital 
//                  to small.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public void StrCpySmall(String str)
    {

        int iCnt = 0;

        char Arr[] = str.toCharArray();

        char[] reversed = new char[Arr.length];
       
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
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

class program1_4
{
    public static void main(String A[])
    {
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();


        STRINGX strobj = new STRINGX();
        strobj.StrCpySmall(sobj);
        
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//GANPATI BAPPA MORYA
//ganpati bappa morya
//
/////////////////////////////////////////////////////////////////////////////////////