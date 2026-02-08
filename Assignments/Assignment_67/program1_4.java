import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ChkBit
//  Description:    It is used to chek if given two positions bit is ON or
//                  OFF.
//  Input:          Integer.
//  Output:         Boolean.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           08/2/2026
//
/////////////////////////////////////////////////////////////////////////////

class Check
{
    public boolean ChkBit(int iNo,int iPos1,int iPos2)
    {
        boolean bFlag = false;
        int iMask = 0x1;
        int iResult = 0;

        int iMask1 = iMask << (iPos1 - 1);
        iResult = iNo & iMask1;

        if(iResult == iMask1)
        {
            bFlag = true;
        }

        int iMask2 = iMask << (iPos2 - 1);
        iResult = iNo & iMask2;

        if(iResult == iMask2)
        {
            bFlag = true;
        }

        return bFlag;

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
        int iRet = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the first position:");
        int iPos1 = sobj.nextInt();

        System.out.println("Enter the second position:");
        int iPos2 = sobj.nextInt();

        Check cobj = new Check();

        bRet = cobj.ChkBit(iNo1,iPos1,iPos2);
        
        if(bRet == true)
        {
            System.out.printf("%dth or %dth bit is ON.",iPos1,iPos2);
        }
        else
        {
           System.out.printf("%dth and %thd bit is OFF.",iPos1,iPos2); 
        }

    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//8
//Enter the first position:
//4
//Enter the second position:
//2
//4th or 2th bit is ON.
/////////////////////////////////////////////////////////////////////////////////////////