/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  checkPrime
//  Description:    It is used to check input number is prime number or not
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           28/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void checkPrime(int num)
    {
        int iCnt =0;
        
        for(iCnt=2;iCnt<=num;iCnt++)
        {
            if((num%iCnt)==0)
            {
                System.out.println("It is not prime number");
                break;
            }
            else
            {
                System.out.println("It is prime number");
                break;
            }
        }
    }
}

//Time Complexity:O(1)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_1
{
    public static void main(String args[])
    {
        Logic obj= new Logic();
        obj.checkPrime(11);
    }
}

////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:11         output:It is prime number
//  Input1:10         output:It is not prime number
//
/////////////////////////////////////////////////////////////////////////////