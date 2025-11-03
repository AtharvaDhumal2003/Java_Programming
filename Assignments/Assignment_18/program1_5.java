/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  checkSign
//  Description:    It is used to check given number is positive or negative
//                  or zero
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void checkSign(int num)
    {
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num<0)
        {
            System.out.println("Negative");
        }
        else  if(num == 0)
        {
            System.out.println("Zero");
        }
        
    }
}
//Time Complexity:O(1)

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
        obj.checkSign(-8);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:-8         output:Negative 
//
/////////////////////////////////////////////////////////////////////////////