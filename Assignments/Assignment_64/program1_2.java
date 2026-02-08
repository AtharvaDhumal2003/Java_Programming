import java.util.*;
/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ChkBit
//  Description:    It is used to check if 5th & 18th bit is ON or OFF.
//  Input:          Integer.
//  Output:         Boolean.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           05/2/2026
//
/////////////////////////////////////////////////////////////////////////////
class Check
{
    public boolean ChkBit(int iNo)
    {
        int iMask = 0x0020010;
        int iResult = iMask & iNo;

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

class program1_2
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();

        Check cobj = new Check();

        bRet = cobj.ChkBit(iNo);

        if(bRet == true)
        {
            System.out.println("5th and 18th bit is ON.");
        }
        else
        {
           System.out.println("5th and 18th bit is OFF."); 
        }

    }
}

///////////////////////////////////////////////////////////////////////////
//Enter the number:
//131088
//5th and 18th bit is ON.
//
//Enter the number:
//528
//5th and 18th bit is OFF.
///////////////////////////////////////////////////////////////////////////