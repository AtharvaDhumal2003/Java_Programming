import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  OnFourBit
//  Description:    It is used to on the first 4 bits of given number.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           06/2/2026
//
/////////////////////////////////////////////////////////////////////////////
class Check
{
    public int OnFourBit(int iNo)
    {
        int iMask = 0x0000000f;
        
        iNo = iMask | iNo;

        return iNo;
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
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        Check cobj = new Check();

        iRet = cobj.OnFourBit(iNo);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//
//Enter the number:
//73
//79
//
//Enter the number:
//48
//63
/////////////////////////////////////////////////////////////////////////////////////////