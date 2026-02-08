import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ChkBit
//  Description:    It is used to check if given positions bit in given number
//                  is ON or OFF.
//  Input:          Integer.
//  Output:         Boolean.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           06/2/2026
//
/////////////////////////////////////////////////////////////////////////////

class Check
{
    public boolean ChkBit(int iNo,int iPos)
    {
        int iMask = 0x1,iResult = 0;
        
        iMask = iMask << (iPos - 1);

        iResult = iMask & iNo;

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

class program1_1
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        
        System.out.println("Enter the position:");
        int iPos = sobj.nextInt();

        Check cobj = new Check();

        bRet = cobj.ChkBit(iNo,iPos);

        System.out.println(bRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//8
//Enter the position:
//4
//true
//
/////////////////////////////////////////////////////////////////////////////////////////