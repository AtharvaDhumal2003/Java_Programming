////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,ChkIdentity
//  Description:    It is used to accept and display the elements of matrix 
//                  and it used to check if matrix is identity matrix or not.
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

   public Boolean ChkIdentity()
    {
        int i = 0;
        int j = 0;
        Boolean bFlag = false;

        if(iRow != iCol)
        {
            System.out.println("Number of rows and columns should be same.");
            return false;
        }

        for(i = 0; i < iRow && bFlag ==true; i++)
        {
            for(j= 0; j < iCol; j++)
            {
                if(i == j)
                {
                  if(Arr[i][j] == 1)
                  {
                    bFlag = true;
                  }  
                }
                else 
                {
                    if(Arr[i][j] != 0)
                    {
                        bFlag = false;
                        break;
                    }
                }
            }
        }

        return bFlag;
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

        Boolean bRet = mobj.ChkIdentity();

        if(bRet == true)
        {
            System.out.println("It is identity matrix.");
        }
        else
        {
            
            System.out.println("It is not identity matrix.");
        }
        
    }
}
///////////////////////////////////////////////////////////////////////////
//
//Enter the elements of Row: 1
//1
//0
//0
//0
//Enter the elements of Row: 2
//0
//1
//0
//0
//Enter the elements of Row: 3
//0
//0
//1
//2
//Enter the elements of Row: 4
//0
//0
//0
//1
//Elements of matrix are:
//1       0       0       0
//0       1       0       0
//0       0       1       2
//0       0       0       1
//
//It is not identity matrix.
///////////////////////////////////////////////////////////////////////////