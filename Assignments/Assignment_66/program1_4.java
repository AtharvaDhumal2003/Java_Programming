import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ToggleBit
//  Description:    It is used to toggle the bit at given position in given 
//                  number.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           06/2/2026
//
/////////////////////////////////////////////////////////////////////////////
class Check
{
    public int ToggleBit(int iNo,int iPos)
    {
        int iMask = 0x1;
        
        iMask = iMask << (iPos - 1);

        iNo = iNo ^ iMask;

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
        
        
        System.out.println("Enter the position:");
        int iPos = sobj.nextInt();

        Check cobj = new Check();

        iRet = cobj.ToggleBit(iNo,iPos);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//10
//Enter the position:
//3
//14
//
//C:\Users\athar\Desktop\LBA\Assignment66>java program1_4.java
//Enter the number:
///14
//Enter the position:
//3
//10
/////////////////////////////////////////////////////////////////////////////////////////