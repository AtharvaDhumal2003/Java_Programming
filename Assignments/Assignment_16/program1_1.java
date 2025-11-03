/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  CalculateSum
//  Description:    It is used to calculate sum of first n natural numbers
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void calculateSum(int n)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt=1;iCnt<=n;iCnt++)
        {
           iSum=iSum+iCnt;
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
        obj.calculateSum(10);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:10                  output:55
//
/////////////////////////////////////////////////////////////////////////////
