////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,ReverseRow
//  Description:    It is used to accept and display the elements of matrix 
//                  and it used to reverse each row in the matrix.
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

    public void ReverseRow()
    {
        int i = 0;
        int j = 0;
        int temp = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol/2; j++)
            { 
                temp = Arr[i][j];
                Arr[i][j] = Arr[i][iRow-(j+1)] ; 
                Arr[i][iRow-(j+1)]  = temp;           
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

class program1_2
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();
        mobj.ReverseRow();
        
    }
}
///////////////////////////////////////////////////////////////////////////
//Enter the elements of Row: 1
//
//Elements of matrix are:
//1       2       3       4       5
//1       2       3       4       5
//1       2       3       4       5
//1       2       3       4       5
//1       2       3       4       5
//Matrix after Row Swapping:
//Elements of matrix are:
//5       4       3       2       1
//5       4       3       2       1
//5       4       3       2       1
//5       4       3       2       1
//5       4       3       2       1
///////
//Elements of matrix are:
//3       2       5       9
//4       3       2       2
//8       4       1       9
//3       9       7       5
//Matrix after Row Swapping:
//Elements of matrix are:
//9       5       2       3
//2       2       3       4
//9       1       4       8
//5       7       9       3
///////////////////////////////////////////////////////////////////////////