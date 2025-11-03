/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  checkLeapYear
//  Description:    It is used to check input year is leap year or not 
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void checkLeapYear(int year)
    {
        if((year%4)==0)
        {
            System.out.println("It is Leap year");
        }
        else
        {
            System.out.println("It is Not Leap year");
        }
    }
}
//Time Complexity:O(1)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_1
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.checkLeapYear(2024);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:2024         output:It is Leap year
//
/////////////////////////////////////////////////////////////////////////////