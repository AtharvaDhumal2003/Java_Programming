/////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//  
/////////////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////////////
// Class Name :     STRINGX
// Function name:   countCapital
//  Description:    It used to count capital letters in given string.   
//  Input:          char
//  Author:         Atharva Sanjay Dhumal.
//  Date:           03/12/2025
//
/////////////////////////////////////////////////////////////////////////////
class STRINGX
{
    public int CountCapital(String str)
    {

        int iCnt = 0,iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
           {
                iCount++;
           }
        }

        return iCount;   
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
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        STRINGX strobj = new STRINGX();
        iRet = strobj.CountCapital(sobj);

        System.out.println("Number of capital characters are :"+iRet);
        
    }
}
////////////////////////////////////////////////////////////////////////////////////
//
//Enter String:
//Marvellous Multi OS
//Frequency of capital character is :4
//Enter String:
//logic building
//Frequency of capital character is :0
//
/////////////////////////////////////////////////////////////////////////////////////