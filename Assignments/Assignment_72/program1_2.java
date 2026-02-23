////////////////////////////////////////////////////////////////////////////////
//Required Pakages
////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/////////////////////////////////////////////////////////////////////////////
//  Class Name :    Matrix
//  Functions :     Accept,Display,FrequencyofNumber 
//  Description:    It is used to accept and display the elements of matrix 
//                  and it counts the frquency of given number in matrix.
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

    public int FrequencyofNumber(int iNo)
    {
        int i = 0;
        int j = 0;

        int iFrequency = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j= 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iFrequency++;
                }
            }
        }

        return iFrequency;
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

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number you want to search:");
        int iValue = sobj.nextInt();

        System.out.println("The number occured : "+(mobj.FrequencyofNumber(iValue))+"times.");
        
    }
}
///////////////////////////////////////////////////////////////////////////
//Enter the elements of Row: 1
//1
//2
//3
//4
//Enter the elements of Row: 2
//55
//66
//77
//88
//Enter the elements of Row: 3
//22
//33
//44
//55
//Enter the elements of Row: 4
//11
//21
//33
//55
//Elements of matrix are:
//1       2       3       4
//55      66      77      88
//22      33      44      55
//11      21      33      55
//Enter the number you want to search:
//55
//The number occured : 3times.
///////////////////////////////////////////////////////////////////////////