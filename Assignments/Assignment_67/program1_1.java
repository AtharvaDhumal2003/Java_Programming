import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  CountOne
//  Description:    It is used to accept one number from user and counts 
//                  number of ON bits.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           08/2/2026
//
/////////////////////////////////////////////////////////////////////////////

class Check
{
    public int CountOne(int iNo)
    {
        int i = 0,iCount = 0,iResult = 0;
        int iMask = 0x00000001;
        
        for(i = 0; i <= 31; i++)
        {
            iMask = 0x00000001;
            iMask = iMask << i;

            iResult = iNo & iMask;

            if(iResult != 0)
            {
                iCount++;
            }
        }

            return iCount;
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
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();

        Check cobj = new Check();

        iRet = cobj.CountOne(iNo);

        System.out.println(iRet);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the number:
//11
//3
//
//Enter the number:
//52
//3
//Enter the number:
//53
//4
/////////////////////////////////////////////////////////////////////////////////////////