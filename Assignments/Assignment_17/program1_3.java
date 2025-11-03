/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  findMax
//  Description:    It is used to find maximum number 
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void findMax(int a,  int b)
    {
        if(a>b)
        {
            System.out.println("Maximum number is:"+a);
        }
        else
        {
            System.out.println("Maximum number is:"+b);
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
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:20      Input2:15            output:Maximum nuber is:20
//
/////////////////////////////////////////////////////////////////////////////