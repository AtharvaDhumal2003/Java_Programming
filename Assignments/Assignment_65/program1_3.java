import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ToggleBit
//  Description:    It is used to toggle the 7th bit of givn number.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           06/2/2026
//
/////////////////////////////////////////////////////////////////////////////


class Check
{
    public int ToggleBit(int iNo)
    {
        int iMask = 0x00000040;
        
        iNo = iMask ^ iNo;

        return iNo;
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
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        Check cobj = new Check();

        iRet = cobj.ToggleBit(iNo);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//
//Enter the number:
//76
//12
//
//Enter the number:
//12
//76
/////////////////////////////////////////////////////////////////////////////////////////