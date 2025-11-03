/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  sumEvenOddNumber
//  Description:    It is used to display sum of even numbers and odd numbers
//                  upto input number.
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void sumEvenOddDigits(int num)
    {
        int iDigit = 0;
        int iESum = 0;
        int iOSum = 0;

        while(num != 0)
        {
            iDigit=num % 10;

            if((iDigit%2)==0)
            {
                iESum=iESum+iDigit;
            }    
            else
            {
                iOSum=iOSum+iDigit;
            }
           
            num = num /10;
        }
        
        System.out.println("Sum of even digits is:"+iESum);
        System.out.println("Sum of Odd digits is:"+iOSum);
    }
}
//Time Complexity:O(log N)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_4
{
    public static void main(String args[])
    {
        Logic obj= new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:123456         output:Sum of even digits is:12
//                               Sum of Odd digits is:9
/////////////////////////////////////////////////////////////////////////////