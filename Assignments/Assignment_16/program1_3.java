/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  findFactorial
//  Description:    It is used to calculate factorial of given input
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void findFactorial(int num)
    {
        int iCnt = 0;
        int iFact = 0;
       for(iCnt=num,iFact=1;iCnt>0;iCnt--)
       {
        iFact=iFact*iCnt;
       }
       System.out.println(+iFact);
    }
}
//Time Complexity:O(N)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////


class program1_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:5                  output:120
//
/////////////////////////////////////////////////////////////////////////////