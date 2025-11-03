/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  productDigit
//  Description:    It is used to calculate product of digits in input number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void productofDigits(int num)
    {
        int iDigit=0;
        int iMult=0;

        iMult=1;
        while(num != 0)
        {
            iDigit=num%10;
            iMult=iMult*iDigit;
            num=num/10;
        }
        System.out.println(+iMult);
    }
}
//Time Complexity:O(LogN)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productofDigits(243);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:243               output:24
//
/////////////////////////////////////////////////////////////////////////////