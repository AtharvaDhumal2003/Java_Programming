import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ToggleBit
//  Description:    It is used to toggle the 7th and 10th bit of givn number.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           06/2/2026
//
/////////////////////////////////////////////////////////////////////////////

class Check
{
    public int ChkBit(int iNo)
    {
        int iMask = 0x00000240;
        
        iNo = iMask ^ iNo;

        return iNo;
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
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        Check cobj = new Check();

        iRet = cobj.ChkBit(iNo);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//
//Enter the number:
//580
//4
//
//Enter the number:
//4
//580
/////////////////////////////////////////////////////////////////////////////////////////