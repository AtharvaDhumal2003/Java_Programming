/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  printEvenNumber
//  Description:    It is used to display even number upto input number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void printEvenNumbers(int n)
    {
        int iCnt =0;
        
        for(iCnt=2;iCnt<n;iCnt+=2)
        {
            System.out.println(+iCnt);
        }
    }
}
//Time Complexity:O(N)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_2
{
    public static void main(String args[])
    {
        Logic obj= new Logic();
        obj.printEvenNumbers(20);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:20         output:2 4 6 8 10 12 14 18 
//
/////////////////////////////////////////////////////////////////////////////