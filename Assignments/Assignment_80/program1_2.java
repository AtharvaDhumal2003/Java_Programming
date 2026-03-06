import java.util.*;

class program1_2
{
        public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int R = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int C = sobj.nextInt();

        if(R < 0 || C < 0 || R != C)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Matrix[][] = new int[R][C];
        int i = 0, j = 0;
        int iSum = 0;
        int jSum = 0;
        int SumRows[] = new int [R];
        int SumCol[] = new int[C];
        int SumDigonal = 0;
        int SumDigonal1 = 0;
        boolean bFlag = false;

        for( i = 0; i < R; i++)
        {
            System.out.println("Enter elements of row : "+(i+1));
            for( j = 0; j < C; j++)
            {
                Matrix[i][j] = sobj.nextInt();

                if(Matrix[i][j] < 0)
                {
                    System.out.println("Invalid Input.");
                    return;
                }
            }
        }

        for(i = 0; i < R; i++)
        {
            for(j = 0,iSum = 0,jSum = 0; j < C; j++)
            {
                System.out.print("\t"+Matrix[i][j]);
                iSum = iSum + Matrix[i][j];  
                jSum = jSum + Matrix[j][i];  

                if(i == j)
                {
                    SumDigonal = SumDigonal + Matrix[i][j];
                }

                if(((i + j) ) == (R - 1) ||((i + j)) == (C - 1))
                {
                    SumDigonal1 = SumDigonal1 + Matrix[i][j];
                }

            }
            System.out.println();
            SumRows[i] = iSum;
            SumCol[i] = jSum;
        }

        if(SumDigonal != SumDigonal1)
        {
            bFlag = true;
        }
        else
        {
            bFlag = false;
        }

        for(i = 1; i < R; i++)
        {
            if(SumRows[i-1] != SumRows[i])
            {
                bFlag = true;
                break;
            }
            
            if(SumCol[i-1] != SumCol[i])
            {
                bFlag = true;
                break;
            }

        }
        System.out.println(bFlag);


        if(bFlag == true)
        {
            System.out.println("It is not a Magic Square.");
        }
        else
        {
            System.out.println("It is a Magic Square.");
        }

        sobj.close();
    }    
}
////////////////////////////////////////////////////////////////////////////////////////
/////C:\Users\athar\Desktop\LBA\Assignment80>java program1_2.java
//Enter number of rows:
//3
//Enter number of columns :
//3
//Enter elements of row : 1
//1
//1
//1
//Enter elements of row : 2
//1
//1
//1
//Enter elements of row : 3
//1
//1
//1
//        1       1       1
//        1       1       1
//        1       1       1
//false
//It is a Magic Square.
///////////////////////////////////////////////////////////////////////////////////////