import java.util.*;

class program1_3
{
        public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int R = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int C = sobj.nextInt();

        if(R < 0 || C < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Matrix[][] = new int[R][C];
        int i = 0, j = 0;
        boolean bFlag = true;

        for( i = 0; i < R; i++)
        {
            System.out.println("Enter elements of row : "+(i+1));
            for( j = 0; j < C; j++)
            {
                Matrix[i][j] = sobj.nextInt();

                if(Matrix[i][j] != 0 && Matrix[i][j] != -1)
                {
                    System.out.println("Invalid Input.");
                    return;
                }
            }
        }

        for( i = 0; i < R && bFlag == true; i++)
        {
            for( j = 0; j < C; j++)
            {
                if(i == 0)
                {
                    if(Matrix[i][j] == 0)
                    {
                        if(Matrix[i+1][j] == Matrix[i][j])
                        {
                            bFlag = true;
                            break;
                        }
                        else
                        {
                            bFlag = false;
                        }
                    }
                }

                if(i != 0 && i != (R-1))
                {
                    if(Matrix[i][j] == 0 && Matrix[i-1][j] == Matrix[i][j])
                    {
                        bFlag = true;
                        break;
                    }
                    else
                    {
                        bFlag = false;
                    }
                }

                if(i == (R-1))
                {
                    if(Matrix[i][j] == -1)
                    {
                        bFlag = false;
                    }
                }
                
            }
        }

        if(bFlag == true)
        {
            System.out.println("Path Available.");
        }
        else
        {
            System.out.println("Path Not Available.");
        }

        sobj.close();
    }    
}
////////////////////////////////////////////////////////////////////////////////////////
///Enter number of rows:
//4
//Enter number of columns :
//4
//Enter elements of row : 1
//-1
//0
//0
//-1
//Enter elements of row : 2
//0
//0
//-1
//-1
//Enter elements of row : 3
//-1
//0
//0
//-1
//Enter elements of row : 4
//0
//0
//0
//0
//Path Available.
///////////////////////////////////////////////////////////////////////////////////////