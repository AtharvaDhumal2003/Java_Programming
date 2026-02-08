import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ChkBit
//  Description:    It is used to check if 7th & 8th & 9th bit 
//                  is ON or OFF.
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
        int iMask = 0x000001c0;
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

class program1_4
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
            System.out.println("7th,8th and 9th bit is ON.");
        }
        else
        {
           System.out.println("7th,8th and 9th bit is OFF."); 
        }

    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//448
//7th,8th and 9th bit is ON.
//
//Enter the number:
//16768
//7th,8th and 9th bit is OFF.
/////////////////////////////////////////////////////////////////////////////////////////