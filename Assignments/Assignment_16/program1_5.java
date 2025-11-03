/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  countDigits
//  Description:    It is used to count digits in given input
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void countDigits(int num)
    {
        int iCount = 0;

        while(num != 0)
        {
            iCount++;
            num=num/10;
        }

        System.out.println(+iCount);
    }
    
}
//Time Complexity:O(N)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(1234);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:1234                  output:4
//
/////////////////////////////////////////////////////////////////////////////