////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,Transpose
//  Description:    It is used to accept and display the elements of matrix 
//                  and it perfoms the transpose of matrix.
//  Input:          Integer.
//  Author:         Atharva Sanjay Dhumal.
//  Date:           23/2/2026
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

    public void Transpose()
    {
        int i = 0;
        int j = 0;
        int temp = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            { 
                if(i != j && j > i)
                {
                    temp = Arr[i][j];
                    Arr[i][j] = Arr[j][i];
                    Arr[j][i] = temp;
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

class program1_1
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();
        mobj.Transpose();
        
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
//1       5       1       5
//2       6       2       6
//3       7       3       7
//4       8       4       8
///////////////////////////////////////////////////////////////////////////