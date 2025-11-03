/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  displayGrade
//  Description:    It is used to display digits of number
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void printDigits(int num)
    {
       int iDigit = 0;
       
       while(num != 0)
       {
            iDigit=num%10;
            System.out.println(+iDigit);
            num = num/10;
       }
    }
}
//Time Complexity:O(LogN)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_4
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.printDigits(9876);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:9876         output:6789
//
/////////////////////////////////////////////////////////////////////////////