import java.util.*;

class program1_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Topper = 0;
        float Average = 0.0f;
        int i = 0, j= 0;
        int iSum = 0,iMax = 0;


        System.out.println("Enter numer of students : ");
        int R = sobj.nextInt();

        System.out.println("Enter number of subjects : ");
        int C = sobj.nextInt();

        int Arr[][] = new int[R][C];
        int TotalMarks[] = new int[R];
        boolean StudentFailed[] = new boolean[R];

        if(R < 0 || C < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        for(i = 0; i < R; i++)
        {
            System.out.println("Enter the marks of student : "+(i+1));
            for(j = 0,iSum = 0; j < C; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] < 0 || Arr[i][j] > 100)
                {
                    System.out.println("Invalid Input.");
                    return;
                }

                if(Arr[i][j] < 35)
                {
                    StudentFailed[i] = true;
                }
                
                iSum = iSum + Arr[i][j];
            }
            TotalMarks[i] = iSum;
        }

        System.out.println("Student Totals : ");
        for(i=0; i < R; i++)
        {
            System.out.println("Student "+(i+1)+":"+TotalMarks[i]);
            if(TotalMarks[i] > iMax)
            {
                iMax = TotalMarks[i];
                Topper = i+1;
            }

        }
        
        System.out.println("Topper Student : \n"+Topper);

        System.out.println("Subject Average : ");
        for(i = 0; i < R; i++)
        {
            //Average = 
            System.out.println("Student "+(i+1)+":"+((float)TotalMarks[i] / (float)C));
        }

        System.out.println("Students Failed : ");
        for(i = 0; i < R;i++)
        {
            if(StudentFailed[i] == true)
            {
                System.out.println(i+1);
            }
        }

    }
}
////////////////////////////////////////////////////////////////////////////////
///Enter numer of students :
//4
//Enter number of subjects :
//4
//Enter the marks of student : 1
//56
//78
//98
//45
//Enter the marks of student : 2
//45
//67
//89
//34
//Enter the marks of student : 3
//56
//78
//95
//56
//Enter the marks of student : 4
//78
//56
//78
//67
//Student Totals :
//Student 1:277
//Student 2:235
//Student 3:285
//Student 4:279
//Topper Student :
//3
//Subject Average :
//Student 1:69.25
//Student 2:58.75
//Student 3:71.25
//Student 4:69.75
//Students Failed :
//2
///////////////////////////////////////////////////////////////////////////////
