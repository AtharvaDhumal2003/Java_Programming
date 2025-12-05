/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   strcpyToggleX
//  Description:    It used to copy string by toggling chraters small to 
//                  captal and capital to small.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public void strcpyToggleX(String str)
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
            else if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
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

class program1_5
{
    public static void main(String A[])
    {
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();


        STRINGX strobj = new STRINGX();
        strobj.strcpyToggleX(sobj);
        
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//MARVELLOUS python 2
//marvellous PYTHON 2
//
/////////////////////////////////////////////////////////////////////////////////////