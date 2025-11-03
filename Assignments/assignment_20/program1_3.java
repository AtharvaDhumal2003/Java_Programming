/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  checkPerfect
//  Description:    It is used to  check whether number is perfect or not.
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void checkPerfect(int n)
    {
        int iCnt =0;
        int iSum =0;

        for(iCnt=1;iCnt<n;iCnt++)
        {
            
            if((n%iCnt)==0)
            {
              iSum=iSum+iCnt;
            } 
        }
        
        if(iSum == n)
        {
            System.out.println("It is perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
        
    }

}
//Time Complexity:O(N)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////

class program1_3
{
    public static void main(String args[])
    {
        Logic obj= new Logic();
        obj.checkPerfect(6);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:6                  output:It is  perfect number
//
/////////////////////////////////////////////////////////////////////////////