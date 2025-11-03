/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  findLargestDigit
//  Description:    It is used to find largest digit in given number 
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void findLargestDigit(int num)
    {
       int iDigit = 0;
       int iNo1 = 0;
       int iNo2 = 0;

       while(num != 0)
       {
            
            iDigit=num%10;
            if(iDigit>iNo1)
            {
                iNo2=iDigit;
            }
            iNo1 = iDigit;
            
            num = num/10;
       }
       System.out.println("Largest number in given digit is:"+iNo2);
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
        obj.findLargestDigit(9876);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:9876                  output:Largest number in given digit is:9
//
/////////////////////////////////////////////////////////////////////////////