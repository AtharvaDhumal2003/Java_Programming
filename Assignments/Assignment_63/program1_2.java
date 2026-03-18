import java.io.*;
import java.util.*;

class program1_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file : ");
        String source = sobj.nextLine();
        
        System.out.println("Enter the name of destination file : ");
        String dest = sobj.nextLine();
        
        int data = 0;

        File fobj = new File(source.trim());
        File fobj1 = new File(dest.trim());

        if(fobj.exists())
        {
            FileInputStream IS = new FileInputStream(fobj);
            FileOutputStream OS = new FileOutputStream(fobj1);

            long StartTime1 = System.nanoTime();

            while((data = IS.read()) != -1)
            {
                OS.write((char)data);
            }

            long EndTime1 = System.nanoTime();

            IS.close();
            OS.close();

            
            IS = new FileInputStream(fobj);
            OS = new FileOutputStream(fobj1);

            BufferedInputStream BI = new BufferedInputStream(IS);
            BufferedOutputStream BO = new BufferedOutputStream(OS);
            
            long StartTime2 = System.nanoTime();

            while((data = BI.read()) != -1)
            {
                BO.write((char)data);
            }

            long EndTime2 = System.nanoTime();

            long FinalTime1 = EndTime1 - StartTime1;
            long FinalTime2 = EndTime2 - StartTime2;

            System.out.println("Time required for InputStream : "+FinalTime1);
            System.out.println("Time required for BufferedInputStream : "+FinalTime2);

            BO.close();

        }
        else
        {
            System.out.println("There is no such file.");
        }


        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////
/////C:\Users\athar\Desktop\LBA\Assignment61>java program1_1.java
//Enter the name of source file :
//LB.txt
//Enter the name of destination file :
//A.txt
//Time required for InputStream : 72747500
//Time required for BufferedInputStream : 1688000
//
///////////////////////////////////////////////////////////////////////////