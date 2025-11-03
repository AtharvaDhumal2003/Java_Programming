/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  findSmallestDigit
//  Description:    It is used to find smallest digit in given number .
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void findSmallestDigit(int num)
    {
       int iDigit = 0;
       int iNo1 = 0;
       int iNo2 = 0;

       while(num != 0)
       {
            
            iDigit=num%10;
            if(iDigit<iNo1)
            {
                iNo2=iDigit;
            }
            iNo1 = iDigit;
            
            num = num/10;
       }
       System.out.println("Smallest number in given digit is:"+iNo2);
    }
}
//Time Complexity:O(LogN)

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
        obj.findSmallestDigit(45872);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:45872               output:Smallest number in given digit is:4
//
/////////////////////////////////////////////////////////////////////////////