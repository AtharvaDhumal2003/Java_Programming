/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  checkPalindrome
//  Description:    It is used to check given number is palindrome or not
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
      void checkPalindrome(int num)
      {
        
        int iDigit = 0;
        int reverse = 0;

        while(num != 0)
        {
            iDigit=num % 10;
            reverse=(reverse * 10) + iDigit;
            num=num/10;
            
        }
        System.out.println(+reverse);

        if(reverse == num)
        {
          System.out.println("It is palindrome number");
        }
        else
        {
          System.out.println("It is not palindrome number");
        }
      }
}
//Time Complexity:O(N)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(1331);
    }
}