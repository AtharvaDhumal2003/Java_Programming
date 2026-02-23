////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,ReverseCol
//  Description:    It is used to accept and display the elements of matrix 
//                  and it used to reverse each column in the matrix.
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

    public void ReverseCol()
    {
        int i = 0;
        int j = 0;
        int temp = 0;

        for(i = 0; i < iRow/2; i++)
        {
            for(j = 0; j < iCol; j++)
            { 
                temp = Arr[i][j];
                Arr[i][j] = Arr[iCol - (i+1)][j] ; 
                Arr[iCol - (i+1)][j]  = temp;           
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

class program1_3
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();
        mobj.ReverseCol();
        
    }
}
///////////////////////////////////////////////////////////////////////////
//
//Elements of matrix are:
//1       1       1       1
//2       2       2       2
//3       3       3       3
//4       4       4       4
//Matrix after Row Swapping:
//Elements of matrix are:
//4       4       4       4
//3       3       3       3
//2       2       2       2
//1       1       1       1
///////////////////////////////////////////////////////////////////////////