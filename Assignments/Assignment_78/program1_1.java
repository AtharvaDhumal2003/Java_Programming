import  java.util.*;

class program1_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float Bill = 0.0f;

        System.out.println("Enter number of days you stayed : ");
        int Days = sobj.nextInt();

        if(Days < 0)
        {
            System.out.println("Invalid Input.");;
            return;
        }

        Bill = (float)Days * (float)3000;

        if(Days > 7)
        {
            Bill = Bill - (Bill * 0.05f);
        }

        System.out.println("Total Stays Duration : "+Days);
        System.out.println("Final Bill Amount : "+Bill);

    }
}

////////////////////////////////////////////////////////////////////////
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_1.java
//Enter number of days you stayed :
//-1
//Invalid Input.
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_1.java
//Enter number of days you stayed :
//0
//Total Stays Duration : 0
//Final Bill Amount : 0.0
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_1.java
//Enter number of days you stayed :
//12
//Total Stays Duration : 12
//Final Bill Amount : 34200.0
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_1.java
//Enter number of days you stayed :
//5
//Total Stays Duration : 5
//Final Bill Amount : 15000.0
////////////////////////////////////////////////////////////////////////
