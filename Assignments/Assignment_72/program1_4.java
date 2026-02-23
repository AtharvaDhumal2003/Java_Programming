////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,AddCol
//  Description:    It is used to accept and display the elements of matrix 
//                  and calculates the addition of elements of each column .
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

    public void AddCol()
    {
        int i = 0;
        int j = 0;
        int iSum = 0;

        for(j = 0; j < iCol; j++)
        {
            iSum = 0;

            for(i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.println("Addition of "+(j+1)+"column is "+iSum);
        }

    }
}

/////////////////////////////////////////////////////////////////////////////
//  
//  Entry Point Functions Class
//
/////////////////////////////////////////////////////////////////////////////

class program1_4
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,4);

        mobj.Accept();
        mobj.Display();
        mobj.AddCol();
        
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
//Addition of 1column is 12
//Addition of 2column is 16
//Addition of 3column is 20
//Addition of 4column is 24
///////////////////////////////////////////////////////////////////////////