/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  calculatePower
//  Description:    It is used to calculate power of first input in second 
//                  input times.
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void calculatePower(int base,int exp)
    {
       int iCnt= 0;
       int power = 0;

       for(iCnt=1,power=1;iCnt<=exp;iCnt++)
       {
        power=power*base;
       }
       System.out.println(+power);
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
        Logic obj=new Logic();
        obj.calculatePower(2,5);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:2    Input2:5     output:32
//
/////////////////////////////////////////////////////////////////////////////