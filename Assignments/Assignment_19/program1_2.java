/////////////////////////////////////////////////////////////////////////////
//  Class :         Logic
//  Function name:  displayGrade
//  Description:    It is used to display display grade as per input marks
//  Input:          int 
//  Author:         Atharva Sanjay Dhumal.
//  Date:           30/10/2025
//
/////////////////////////////////////////////////////////////////////////////
class Logic
{
    void displayGrade(int marks)
    {
        if(marks>80 && marks<100)
        {
        System.out.println("Your grade is A");
        }
        else if(marks>60 && marks<80)
        {
            System.out.println("Your grade is B");
        }
        else if(marks>40 && marks<60)
        {
            System.out.println("Your grade is C");
        }
        else if(marks<40)
        {
            System.out.println("Your are fail");
        }

    }
}
//Time Complexity:O(1)

/////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the application
//
/////////////////////////////////////////////////////////////////////////////
class program1_2
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.displayGrade(82);
    }
}
////////////////////////////////////////////////////////////////////////////
//
// Testcases Succesfully handled by the application
//  Input1:82         output:your grade is  A
//
/////////////////////////////////////////////////////////////////////////////