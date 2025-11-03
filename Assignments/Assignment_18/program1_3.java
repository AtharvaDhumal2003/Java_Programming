/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  printoddNumber
//  Description:    It is used to display odd number upto input number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void printOddNumbers(int n)
    {
        int iCnt =0;
        
        for(iCnt=1;iCnt<n;iCnt+=2)
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
class program1_3
{
    public static void main(String args[])
    {
        Logic obj= new Logic();
        obj.printOddNumbers(20);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:20         output:1 3 7 9 11 13 15 19 
//
/////////////////////////////////////////////////////////////////////////////