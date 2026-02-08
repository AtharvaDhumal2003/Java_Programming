import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ChkBit
//  Description:    It is used to chek if 9th or 12th bit given number is 
//                  ON or not.
//  Input:          Integer.
//  Output:         Boolean.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           08/2/2026
//
/////////////////////////////////////////////////////////////////////////////

class Check
{
    public boolean ChkBit(int iNo)
    {
        boolean bFlag = false;
        int iMask1 = 0x00000100, iMask2 = 0x00000800;
        int iResult = 0;

        iResult = iNo & iMask1;

        if(iResult == iMask1)
        {
            bFlag = true;
        }

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

class program1_3
{
    public static void main(String A[])
    {
        int iRet = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int iNo1 = sobj.nextInt();

        Check cobj = new Check();

        bRet = cobj.ChkBit(iNo1);
        
        if(bRet == true)
        {
            System.out.println("9th or 12th bit is ON.");
        }
        else
        {
           System.out.println("9th and 12th bit is OFF."); 
        }

    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the first number:
//2048
//9th or 12th bit is ON.
//
//Enter the first number:
//1
//9th and 12th bit is OFF.
/////////////////////////////////////////////////////////////////////////////////////////