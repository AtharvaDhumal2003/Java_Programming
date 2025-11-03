/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  printTable
//  Description:    It is used to display table of input number 
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void printTable(int num )
    {
        int iCnt = 0;

        for(iCnt=1;iCnt<=10;iCnt++)
        {
            System.out.println("\t"+(num*iCnt));
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
        Logic obj= new Logic();
        obj.printTable(5);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:5    output:5 10 15 20 25 30 35 40 45 50
//
/////////////////////////////////////////////////////////////////////////////