////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,ChkSparse
//  Description:    It is used to accept and display the elements of matrix 
//                  and it used to check if matrix is Sparse matrix or not.
//  Input:          Integer.
//  Output:         Boolean.
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

   public Boolean ChkSparse()
    {
        int i = 0;
        int j = 0;
        int iCount = 0;
        Boolean bFlag = false;

        for(i = 0; i < iRow; i++)
        {
            for(j= 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                  iCount++;  
                }
            }
        }

        if(iCount > ((iRow*iCol)/2))
        {
            bFlag = true;
        }

        return bFlag;
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

        Boolean bRet = mobj.ChkSparse();

        if(bRet == true)
        {
            System.out.println("It is sparse matrix.");
        }
        else
        {
            
            System.out.println("It is not sparse matrix.");
        }
        
    }
}
///////////////////////////////////////////////////////////////////////////
//
//Enter the elements of Row: 1
//Elements of matrix are:
//1       2       3       4
//0       0       0       5
//7       6       0       3
//2       4       0       0
//It is not sparse matrix.
//////////////////
//////////////////
//Elements of matrix are:
//1       0       0       0
//2       0       4       0
//0       0       0       2
//0       8       0       0
//It is sparse matrix.
///////////////////////////////////////////////////////////////////////////