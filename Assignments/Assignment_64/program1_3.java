import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ChkBit
//  Description:    It is used to check if 7th & 15th & 21st  & 28th bit 
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
        int iMask = 0x08104040;
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


class program1_3
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
            System.out.println("7th,15t,21st and 28th bit is ON.");
        }
        else
        {
           System.out.println("7th,15t,21st and 28th bit is OFF."); 
        }

    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignment64>java program1_3.java
//Enter the number:
//135282752
//7th,15t,21st and 28th bit is ON.
//
//C:\Users\athar\Desktop\LBA\Assignment64>java program1_3.java
//Enter the number:
//537411648
//7th,15t,21st and 28th bit is OFF.
/////////////////////////////////////////////////////////////////////////////////////////