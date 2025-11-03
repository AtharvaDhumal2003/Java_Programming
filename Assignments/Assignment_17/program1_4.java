/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  findMin
//  Description:    It is used to  find minimum nuber in given input numbers
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void findMin(int a,  int b, int c)
    {
        if(a<b && b<c)
        {
            System.out.println("Minimum number is:"+a);
        }
        else if(b<c && c<a)
        {
            System.out.println("Minimum number is:"+b);
        }
        else  if(c<a && a<b)
        {
            System.out.println("Minimum number is:"+c);
        }
    }
}
//Time Complexity:O(1)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:3  Input2:7  Input2:2         output:Maximum nuber is:2
//
/////////////////////////////////////////////////////////////////////////////