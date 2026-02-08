import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ChkBit
//  Description:    It is used to check if 1st & 32nd bit 
//                  is ON or OFF.
//  Input:          Integer.
//  Output:         Boolean.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           05/2/2026
//
/////////////////////////////////////////////////////////////////////////////
class Check
{
    public boolean ChkBit(long iNo)
    {
        long iMask = 0x80000001L;
        long iResult = iMask & iNo;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Functions Class
//
/////////////////////////////////////////////////////////////////////////////

class program1_5
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        long iNo = sobj.nextLong();

        Check cobj = new Check();

        bRet = cobj.ChkBit(iNo);

        if(bRet == true)
        {
            System.out.println("1st and 32nd bit is ON.");
        }
        else
        {
           System.out.println("1st or 32nd bit is OFF."); 
        }

    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//2147483649
//1st and 32nd bit is ON
//
//Enter the number:
//2097153
//1st and 32nd bit is OFF.
/////////////////////////////////////////////////////////////////////////////////////////