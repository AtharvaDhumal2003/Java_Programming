/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  countEvenOddRange
//  Description:    It is used to count even and odd numbers upto input number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void countEvenOddRange(int n)
    {
        int iCnt = 0;
        int iECount = 0;
        int iOCount = 0;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if((iCnt%2)==0)
            {
                iECount++;
            }
            else
            {
                iOCount++;
            }
        }
        System.out.println("count of Even numbers is:"+iECount);
        System.out.println("count of Odd numbers is:"+iOCount);
    }
}
//Time Complexity:O(1)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:50               output:count of Even numbers is:25
//                                 count of Odd numbers is:25
/////////////////////////////////////////////////////////////////////////////