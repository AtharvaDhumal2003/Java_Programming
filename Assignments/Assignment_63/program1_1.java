import java.io.*;
import java.util.*;

class program1_1
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
            FileOutputStream OS = new FileOutputStream(fobj1,true);

            BufferedInputStream BI = new BufferedInputStream(IS);
            BufferedOutputStream BO = new BufferedOutputStream(OS);

            while((data = BI.read()) != -1)
            {
                BO.write((char)data);
            }

            System.out.println("Data is successfully copied from source to destination");

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
//A.txt
//Enter the name of destination file :
//B.txt
//Data is successfully copied from source to destination
//
///////////////////////////////////////////////////////////////////////////