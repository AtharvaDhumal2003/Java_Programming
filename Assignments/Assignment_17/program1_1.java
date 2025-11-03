/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  sumofDigits
//  Description:    It is used to calculate sum of digits in given input
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void sumofDigits(int num)
    {
        int iDigit = 0;
        int iSum = 0;

        while(num != 0)
        {
            iDigit=num % 10;
            iSum=iSum+iDigit;
            num=num/10;
        }
        System.out.println(+iSum);
    }
}
//Time Complexity:O(N)

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
        obj.sumofDigits(1234);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:1234                  output:10
//
/////////////////////////////////////////////////////////////////////////////