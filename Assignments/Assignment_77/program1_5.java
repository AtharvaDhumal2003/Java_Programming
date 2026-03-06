import java.util.*;

class program1_5
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
        int BookedCount = 0;
        int NewBookedCount = 0;
        float TotalCost = 0;
        int RowPrice = 150;
        boolean bFlag = true;

        System.out.println("Enter booking Details : (0/1)");
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

                if(Seats[i][j] == 1)
                {
                    BookedCount++;
                }

            }
        }

        System.out.println("Seat layout of Thetre : ");
        for(i = 0; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                System.out.print("\t" + ((Seats[i][j] == 1) ? "BOOk":"FREE"));
            }
            System.out.println();
        }

        int requestedSeatList[][]= new int[R][C];

        System.out.println("Enter booking Details : (0/1)");
        for(i = 0; i < R; i++)
        {
            System.out.println("Enter Details of Row : "+(i+1));
            for(j = 0; j < C; j++)
            {
                requestedSeatList[i][j] = sobj.nextInt();

                if(requestedSeatList[i][j] != 0 && requestedSeatList[i][j] != 1)
                {
                    System.out.println("Invalid input.");
                    return;
                }
            }
            System.out.println();
        }

        for(i = 0; i < R && bFlag == true; i++,RowPrice += 50)
        {
            for(j = 0; j < C; j++)
            {
                if(Seats[i][j] == 1 && requestedSeatList[i][j] == 1)
                {
                    bFlag = false;
                    break;
                }
                else
                {
                    if(requestedSeatList[i][j] == 1)
                    {
                        TotalCost = TotalCost + RowPrice;
                        NewBookedCount++;
                    }

                }
            }
        }

        if(bFlag == true)
        {
            System.out.println("Success.");

            if(NewBookedCount >= 6)
            {
                TotalCost = TotalCost - (TotalCost * 0.1f);
                System.out.println("Total Cost : "+TotalCost);
            }
            else
            {
                System.out.println("Total Cost : "+TotalCost);
            }

            System.out.println("Reamaining Seats : "+((R*C) - BookedCount));
        }
        else
        {
                System.out.println("Failuer.");
        }


        sobj.close();
    }    
}
//////////////////////////////////////////////////////////////////////////
///C:\Users\athar\Desktop\LBA\Assignment77>java program1_5.java
//Enter number of rows in theatre :
////3
//Enter number of columns :
//3
//Enter booking Details : (0/1)
//Enter Details of Row : 1
//0
//1
//1
//Enter Details of Row : 2
//0
//0
//1
//Enter Details of Row : 3
//0
//0
//0
//Seat layout of Thetre :
//        FREE    BOOk    BOOk
//        FREE    FREE    BOOk
//        FREE    FREE    FREE
//Enter booking Details : (0/1)
///Enter Details of Row : 1
///0
//0
//0
//
//Enter Details of Row : 2
//1
//1
//0
//
//Enter Details of Row : 3
//1
//1
//1
//
//Success.
//Total Cost : 1150.0
//Reamaining Seats : 6
//////////////////////////////////////////////////////////////////////////