import  java.util.*;

class program1_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int DuplicateCount = 0;

        System.out.println("Enter total number of votes : ");
        int Votes = sobj.nextInt();

        if(Votes < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int VoterID [] = new int[Votes];

        for(int i = 0; i < Votes;i++)
        {
            System.out.println("Enter voter ID : ");
            VoterID[i] = sobj.nextInt();

            if(VoterID[i] < 0)
            {
                System.out.println("Invalid Input.");
                return;  
            }

            for(int j = 0; j < i; j++)
            {
                if(VoterID [j] == VoterID[i])
                {
                    DuplicateCount++;
                    break;
                }
            }
        }

        System.out.println("Valid Votes : "+(Votes - (DuplicateCount)));
        System.out.println("Rejected Duplicate : "+DuplicateCount);

        sobj.close();

    }
}

////////////////////////////////////////////////////////////////////////
//Enter total number of votes :
//5
//Enter voter ID :
//12
//Enter voter ID :
//13
//Enter voter ID :
//13
//Enter voter ID :
//14
//Enter voter ID :
//15
//Valid Votes : 4
//Rejected Duplicate : 1
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_2.java
//Enter total number of votes :
//0
//Valid Votes : 0
//Rejected Duplicate : 0
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_2.java
//Enter total number of votes :
//-1
//Invalid Input.
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_2.java
//Enter total number of votes :
//4
//Enter voter ID :
//-1
//Invalid Input.
////////////////////////////////////////////////////////////////////////
