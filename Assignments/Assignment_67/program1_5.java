import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  CountOne
//  Description:    It is used to toggle the bits in given range in given 
//                  number.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           08/2/2026
//
/////////////////////////////////////////////////////////////////////////////

class Check
{
    public int ToggleBitRange(int iNo,int iPos1,int iPos2)
    {
        int i = 0,iCount = 0,iResult = 0;
        int iMask = 0x00000001;
        
        for(i = (iPos1-1); i <= (iPos2-1); i++)
        {
            iMask = 0x00000001;
            iMask = iMask << i;

            iNo = iNo ^ iMask;

        }

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
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the range :");
        System.out.println("Enter the first position:");
        int iPos1 = sobj.nextInt();

        System.out.println("Enter the second position:");
        int iPos2 = sobj.nextInt();

        Check cobj = new Check();

        iRet = cobj.ToggleBitRange(iNo1,iPos1,iPos2);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//15
//Enter the range :
//Enter the first position:
//2
//Enter the second position:
//3
//9
//
//:\Users\athar\Desktop\LBA\Assignment67>java program1_5.java
//Enter the number:
//9
////Enter the range :
//Enter the first position:
//2
//Enter the second position:
//3
//15
/////////////////////////////////////////////////////////////////////////////////////////