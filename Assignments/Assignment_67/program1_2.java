import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Check
//  Function name:  CommonBits
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
    public void CommonBits(int iNo1,int iNo2)
    {
        int i = 0,iCount = 0,iResult = 0;
        int iMask = 0x00000001;
        
        int iNo = iNo1 & iNo2;

        for(i = 0; i <= 31; i++)
        {
            iMask = 0x00000001;
            iMask = iMask << i;

            iResult = iNo & iMask;

            if(iResult != 0)
            {
                System.out.println("Common bits are at position:"+(i+1));
            }
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
        System.out.println("Enter the first number:");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the second number:");
        int iNo2 = sobj.nextInt();

        Check cobj = new Check();

        cobj.CommonBits(iNo1,iNo2);


    }
}
//////////////////////////////////////////////////////////////////////////////////////////
//Enter the first number:
//1
//Enter the second number:
//15
//Common bits are at position:1
//
//Enter the first number:
//8
//Enter the second number:
//15
//Common bits are at position:4
/////////////////////////////////////////////////////////////////////////////////////////