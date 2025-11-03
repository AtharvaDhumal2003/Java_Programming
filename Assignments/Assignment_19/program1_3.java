///////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  checkDiviseble
//  Description:    It is used check whether numbeer is divisible by 5 and 11
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
///////////////////////////////////////////////////////////////////////////////
class Logic
{
    void checkDivisible(int num)
    {
        if((num%5)==0 &&  (num%11)==0)
        {
            System.out.println("It is divisible by 5 and 11");
        }
        else
        {
            System.out.println("It is not divisible by 5 and 11");
        }
    }
}
//Time Complexity:O(1)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_3
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.checkDivisible(55);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:55         output:It  is divisible by 5 and 11
//
/////////////////////////////////////////////////////////////////////////////