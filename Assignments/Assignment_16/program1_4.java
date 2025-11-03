/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  reverseNumber
//  Description:    It is used to reverse  given digit
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void reverseNumber(int num)
    {
        int iDigit = 0;

        while(num != 0)
        {
            iDigit=num % 10;
            System.out.println(+iDigit);
            num=num/10;
        }
    }
}
//Time Complexity:O(logN)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:1234                  output:120
//
/////////////////////////////////////////////////////////////////////////////