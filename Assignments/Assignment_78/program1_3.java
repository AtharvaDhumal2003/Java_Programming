import  java.util.*;

class program1_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSum = 0;
        int GoalAchived = 0;
        int iMax = 0;
        int Goal = 5000;
        int Steps [] = new int[7];

        for(int i = 0; i < 7; i++)
        {
            System.out.println("Enter the steps of day : "+(i+1));
            Steps[i] = sobj.nextInt();

            if(Steps[i] < 0)
            {
                System.out.println("Invalid Input.");
                return;
            }

            if(iMax <= Steps[i])
            {
                iMax = Steps[i];
            }

            iSum = iSum + Steps[i];

            if(iSum >= Goal  && GoalAchived == 0)
            {
                GoalAchived = i+1;
            }

        }

        System.out.println("Goal Achived Days : "+GoalAchived);
        System.out.println("Maximum steps in week : "+iMax);


        sobj.close();

    }
    
}

////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_3.java
//Enter the steps of day : 1
//400
//Enter the steps of day : 2
//800
////Enter the steps of day : 3
//800
//Enter the steps of day : 4
///900
///Enter the steps of day : 5
///850
//Enter the steps of day : 6
//1000
//Enter the steps of day : 7
//500
//Goal Achived Days : 7
//Maximum steps in week : 1000
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_3.java
//Enter the steps of day : 1
//900
//Enter the steps of day : 2
//1200
//Enter the steps of day : 3
//1000
//Enter the steps of day : 4
//1300
//Enter the steps of day : 5
//1400
//E/nter the steps of day : 6
//1500
//Enter the steps of day : 7
//2000
//Goal Achived Days : 5
//Maximum steps in week : 2000
///////////////////////////////////////////////////////////////////////////