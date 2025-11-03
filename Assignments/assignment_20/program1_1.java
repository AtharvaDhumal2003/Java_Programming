/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  sumEvenNumbers
//  Description:    It is used to calculate sum of all even numbers upto 
//                  input number.
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt =0;
        int iESum=0;

        for(iCnt=2;iCnt<n;iCnt+=2)
        {
            iESum=iESum+iCnt;
        }
        System.out.println(+iESum);
    }
}
//Time Complexity:O(N/2)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_1
{
    public static void main(String args[])
    {
        Logic obj= new Logic();
        obj.sumEvenNumbers(10);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:10                  output:20
//
/////////////////////////////////////////////////////////////////////////////