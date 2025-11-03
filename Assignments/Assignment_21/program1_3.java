/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  displayFactors
//  Description:    It is used to display factors of given number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;

        for(iCnt=1;iCnt<num;iCnt++)
        {
            if((num%iCnt)==0)
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

class program1_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:12               output:1 2 3 4 6
//
/////////////////////////////////////////////////////////////////////////////