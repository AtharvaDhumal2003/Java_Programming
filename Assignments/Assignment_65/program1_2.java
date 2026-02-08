import java.util.*;
/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  OffBit
//  Description:    It is used to OFF the 7th bit and 10th bit of.
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
        int iMask = 0x00000240;
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


class program1_2
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
//8768
//8192
//
//Enter the number:
//8192
//8192
//
/////////////////////////////////////////////////////////////////////////////////////////