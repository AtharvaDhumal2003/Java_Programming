////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,MaxDiagonal
//  Description:    It is used to accept and display the elements of matrix 
//                  and it used find maximum element from both digonals.
//  Input:          Integer.
//  Output:         Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           22/2/2026
//
/////////////////////////////////////////////////////////////////////////////

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int A, int B)
    {
        this.iRow = A;
        this.iCol = B;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j =0;

        Scanner sobj = new Scanner(System.in);

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of Row: "+(i+1));

            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }

    public void Display()
    {
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Elements of matrix are:");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
               System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        } 

    }

    public int MaxDiagonal()
    {
        int i = 0;
        int j = 0;
        int iMax = 0;

        if(iRow != iCol)
        {
            System.out.println("Number of rows and columns should be same.");
            return -1;
        }

        for(i = 0,iMax = Arr[0][0]; i < iRow; i++)
        {
            for(j= 0; j < iCol; j++)
            {
                if((i == j) || (i + j == iRow - 1))
                {
                  if(iMax < Arr[i][j])
                  {
                    iMax = Arr[i][j];
                  }  
                }
            }
        }

        return iMax;
    }
}

/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Functions Class
//
/////////////////////////////////////////////////////////////////////////////

class program1_3
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        System.out.println("Maximum number from both diagonals is : "+(mobj.MaxDiagonal()));
        
    }
}
///////////////////////////////////////////////////////////////////////////
//Enter the elements of Row: 1
//11
//12
//13
//14
//Enter the elements of Row: 2
//15
//16
//17
//18
//Enter the elements of Row: 3
//55
//56
//57
//58
//Enter the elements of Row: 4
//59
//34
//23
//65
//Elements of matrix are:
//11      12      13      14
//15      16      17      18
//55      56      57      58
//59      34      23      65
//Maximum number from both diagonals is : 65
//////////////////////////////////////////////////////////
//Elements of matrix are:
//1       2       3       4
//5       6       7       8
//45      6       7       8
//98      6       5       4
//Maximum number from both diagonals is : 98
///////////////////////////////////////////////////////////////////////////