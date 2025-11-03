/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  chekEvenOdd
//  Description:    It is used to display does input is even or odd number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void checkEvenOdd(int num)
    {
        if((num%2)==0)
        {
            System.out.println("It is Even Number");
        }
        else
        {
            System.out.println("It is odd number");
        }
    }
}
//Time Complexity:O(1)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////


class program1_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:7                  output:It is odd number
//
/////////////////////////////////////////////////////////////////////////////