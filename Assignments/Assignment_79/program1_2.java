import java.util.*;

class program1_2
{
        public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows in theatre : ");
        int R = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int C = sobj.nextInt();

        if(R <= 0 || C<= 0)
        {
            System.out.println("Invalid input.");
            return;
        }

        int Seats[][] = new int[R][C];
        int i = 0, j = 0;

        System.out.println("Enter booking Details : (0/1");
        for(i = 0; i < R; i++)
        {
            System.out.println("Enter Details of Row : "+(i+1));
            for(j = 0; j < C; j++)
            {
                Seats[i][j] = sobj.nextInt();

                if(Seats[i][j] != 0 && Seats[i][j] != 1)
                {
                    System.out.println("Invalid input.");
                    return;
                }

            }
        }

        int TotalBooked = 0;
        int MaxBookedInRow = 0;
        int RowBooked = 0;
        int RowWithMax = 0;
        Boolean FullRowExit = false;

        for(i = 0; i < R; i++)
        {
            RowBooked = 0;
            for( j = 0; j < C; j++)
            {
                if(Seats[i][j] == 1)
                {
                    TotalBooked++;
                }

                RowBooked = RowBooked + Seats[i][j];
            }

            if(RowBooked > MaxBookedInRow)
            {
                MaxBookedInRow = RowBooked;
                RowWithMax = i;
            }

            if(RowBooked == C)
            {
                FullRowExit = true;
            }

        }
    
        System.out.println("Total BookedSeats : "+TotalBooked);
        System.out.println("Row with maximumBookings : "+(RowWithMax+1));
        System.out.println("Full Row Exists : "+(FullRowExit ? "Yes" : "No"));

        System.out.println("Seat layout of Thetre");
        for(i = 0; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                System.out.print("\t" + ((Seats[i][j] == 1) ? "BOOk":"FREE"));
            }
            System.out.println();
        }

        sobj.close();
    }    
}
////////////////////////////////////////////////////////////////////////////////////////
///C:\Users\athar\Desktop\LBA\Assignment79>java program1_2.java
//Enter number of rows in theatre :
//4
//Enter number of columns :
//4
//Enter booking Details : (0/1
//Enter Details of Row : 1
//0
//1
//1
//0
//Enter Details of Row : 2
//1
//1
//1
//1
//Enter Details of Row : 3
//0
//1
//0
//1
//Enter Details of Row : 4
//1
//1
//1
//0
//Total BookedSeats : 11
//Row with maximumBookings : 2
//Full Row Exists : Yes
//Seat layout of Thetre
//        FREE    BOOk    BOOk    FREE
//        BOOk    BOOk    BOOk    BOOk
//        FREE    BOOk    FREE    BOOk
//        BOOk    BOOk    BOOk    FREE
///////////////////////////////////////////////////////////////////////////////////////