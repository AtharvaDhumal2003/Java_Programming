import java.util.*;
/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  OffBit
//  Description:    It is used to check if 7th bit is ON if ON then OFFs it.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           06/2/2026
//
/////////////////////////////////////////////////////////////////////////////
class Check
{
    public int OffBit(int iNo)
    {
        int iMask = 0x00000040;
        int iResult = iMask & iNo;

        if(iResult == iMask)
        {
            iNo = iNo ^ iMask;
            return iNo;
        }
        else
        {
            return iNo;
        }

    }
}

/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Functions Class
//
/////////////////////////////////////////////////////////////////////////////

class program1_1
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        Check cobj = new Check();

        iRet = cobj.OffBit(iNo);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//
//Enter the number:
//1088
//1024
//
//Enter the number:
//1024
//1024
//
/////////////////////////////////////////////////////////////////////////////////////////