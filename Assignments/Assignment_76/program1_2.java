import java.util.*;

class program1_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your marks : ");
        int Marks = sobj.nextInt();

        System.out.println("Enter your attendence : ");
        int Attendence = sobj.nextInt();

        System.out.println("Enter your Income : ");
        int Income = sobj.nextInt();

        if
        (
            (Marks < 0 || Marks > 100) ||
            (Attendence < 0 || Attendence > 100) ||
            (Income < 0)
        )
        {
            System.out.println("Invalid input.");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Scolarship Rejaected : You have less marks than required.");

        }
        else if(Attendence < 75)
        {
            System.out.println("Scolarship Rejaected : You have less attendence than required.");
        }
        else if(Income > 300000)
        {
            System.out.println("Scolarship Rejaected : Your Income is high.");
        }
        else 
        {
            System.out.println("Scolarship Approved.");
        }
   
    }
}
//////////////////////////////////////////////////////////////////////////////////////
/////C:\Users\athar\Desktop\LBA\Assignment76>java program1_2.java
//Enter your marks :
//89
//Enter your attendence :
//76
//Enter your Income :
//250000
//Scolarship Approved.
//////////////////////////////////////////////////////////////////////////////////////