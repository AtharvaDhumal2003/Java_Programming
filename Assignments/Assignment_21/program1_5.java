/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  printDivisibleBy2and3
//  Description:    It is used to display numbers divisible by 2 and 3 upto
//                  given input number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void printDivisibleBy2and3(int n)
    {
        int iCnt = 0;
        for(iCnt=1;iCnt<=n;iCnt++)
        {
         if((iCnt%2)==0 && (iCnt%3)==0)
          {
            System.out.println(+iCnt);
          }
        }
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
        obj.printDivisibleBy2and3(30);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:30               output:6 12 18 24 30
//
/////////////////////////////////////////////////////////////////////////////