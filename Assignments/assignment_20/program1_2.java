/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  printReverse
//  Description:    It is used to  display number from input n to 1
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printReverse(int n)
    {
        int iCnt =0;

        for(iCnt=n;iCnt>0;iCnt--)
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
        obj.printReverse(10);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:10                  output:10 9 8 7 6 5 4 3 2 1
//
/////////////////////////////////////////////////////////////////////////////