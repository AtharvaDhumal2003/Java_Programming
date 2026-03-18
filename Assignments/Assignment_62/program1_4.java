import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class program1_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String source = sobj.nextLine();


        String str = "Original_backup.ext";


        File fobj = new File(source.trim());
        File fobj1 = new File(str.trim());

        int data = 0;

        if(fobj.exists())
        {
            FileInputStream IS = new FileInputStream(fobj);
            FileOutputStream OS = new FileOutputStream(fobj1);

            while((data = IS.read()) != -1)
            {
                OS.write(data);
            }

            System.out.println("Successfully created backup file.");
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
////C:\Users\athar\Desktop\LBA\Assignment62>java program1_3.java
//C:\Users\athar\Desktop\LBA\Assignment62>java program1_4.java
//Enter the name of file :
//LB.txt
//Successfully created backup file.
//
///////////////////////////////////////////////////////////////////////////