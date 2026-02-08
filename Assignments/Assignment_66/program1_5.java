import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  ToggleBit
//  Description:    It is used to toggle the first 4 nibbles and last 4 nibbles 
//                  in given number.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           06/2/2026
//
/////////////////////////////////////////////////////////////////////////////
class Check
{
    public long ToggleBit(long iNo)
    {
        long iMask = 0x1;
        
        iMask = 0xf000000fL;

        iNo = iNo ^ iMask;

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
        long iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        long iNo = sobj.nextLong();

        Check cobj = new Check();

        iRet = cobj.ToggleBit(iNo);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//4026531887
//32
//
//C:\Users\athar\Desktop\LBA\Assignment66>java program1_5.java
//Enter the number:
//32
//4026531887
/////////////////////////////////////////////////////////////////////////////////////////