import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ChkBit
//  Description:   It is used to ON the bit at given position in given
//                  number.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           06/2/2026
//
/////////////////////////////////////////////////////////////////////////////

class Check
{
    public int ChkBit(int iNo,int iPos)
    {
        int iMask = 0x1;
        
        iMask = iMask << (iPos - 1);

        iNo = iNo | iMask;

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
        
        
        System.out.println("Enter the position:");
        int iPos = sobj.nextInt();

        Check cobj = new Check();

        iRet = cobj.ChkBit(iNo,iPos);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//8
//Enter the position:
//3
//12
//C:\Users\athar\Desktop\LBA\Assignment66>java program1_3.java
//Enter the number:
//10
//Enter the position:
//1
//11
/////////////////////////////////////////////////////////////////////////////////////////