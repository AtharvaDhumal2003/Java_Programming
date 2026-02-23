////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,SwapRow
//  Description:    It is used to accept and display the elements of matrix 
//                  and it swaps the consecutive rows.
//  Input:          Integer.
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

    public void SwapRow()
    {
        int i = 0;
        int j = 0;
        int temp = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == 0 || i == 2)
                {
                    temp = Arr[i][j];
                    Arr[i][j] = Arr[i+1][j];
                    Arr[i+1][j] = temp;
                }
            }
        }

        System.out.println("Matrix after Row Swapping:");
        Display();

    }
}

/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Functions Class
//
/////////////////////////////////////////////////////////////////////////////

class program1_5
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();
        mobj.SwapRow();
        
    }
}
///////////////////////////////////////////////////////////////////////////
//Enter the elements of Row: 1
//1
//2
//3
//4
//Enter the elements of Row: 2
//5
//6
//7
//8
//Enter the elements of Row: 3
//1
//2
//3
//4
//Enter the elements of Row: 4
//5
//6
//7
//8
//Elements of matrix are:
//1       2       3       4
//5       6       7       8
//1       2       3       4
//5       6       7       8
//Matrix after Row Swapping:
//Elements of matrix are:
//5       6       7       8
//1       2       3       4
//5       6       7       8
//1       2       3       4
///////////////////////////////////////////////////////////////////////////