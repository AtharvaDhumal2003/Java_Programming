/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  countFactors
//  Description:    It is used to count factors of given number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void countFactors(int num)
    {
        int iCnt = 0;
        int iCountFact=0;

        for(iCnt=1;iCnt<num;iCnt++)
        {
            if((num%iCnt)==0)
            {
                iCountFact++;
            }
        }
        System.out.println(+iCountFact);
        
    }
}
//Time Complexity:O(N)

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
        obj.countFactors(20);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:20               output:5
//
/////////////////////////////////////////////////////////////////////////////