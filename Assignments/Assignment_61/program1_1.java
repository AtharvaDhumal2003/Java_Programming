import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
            FileOutputStream OS = new FileOutputStream(fobj1);

            while((data = IS.read()) != -1)
            {
                OS.write((char)data);
            }

            System.out.println("Data is successfully copied from source to destination");

            OS.close();
            IS.close();

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
//Demo.txt
//Enter the name of destination file :
//PPA.txt
//Data is successfully copied from source to destination
//
///////////////////////////////////////////////////////////////////////////