import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class program1_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of source file1 : ");
        String source = sobj.nextLine();
        
        System.out.println("Enter name of source file2: ");
        String source2 = sobj.nextLine();

        System.out.println("Enter name of destination file: ");
        String dest = sobj.nextLine();

        int data = 0;
        byte[] Buffer = new byte[1024];
        
        File fobj = new File(source.trim());
        File fobj2 = new File(source2.trim());
        File fobj3 = new File(dest.trim());

        if(fobj.exists() && fobj2.exists())
        {
            FileInputStream IS = new FileInputStream(fobj);
            FileInputStream IS1 = new FileInputStream(fobj2);
            FileOutputStream OS = new FileOutputStream(fobj3);

            while((data = IS.read(Buffer)) != -1)
            {
                OS.write(Buffer,0,data);
            }

            OS.write("\n".getBytes());

            while((data = IS1.read(Buffer)) != -1)
            {
                OS.write(Buffer,0,data);
            }
            
            System.out.println("Data is written into file");
            OS.close();
            IS.close();
            IS1.close();
           
        }
        else
        {
            System.out.println("There is no such file.");
        }


        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////
/////C:\Users\athar\Desktop\LBA\Assignment61>java program1_4.java
//Enter name of source file1 :
//LB.txt
//Enter name of source file2:
//PPA.txt
//Enter name of destination file:
//LSP.txt
//Data is written into file
//
///////////////////////////////////////////////////////////////////////////