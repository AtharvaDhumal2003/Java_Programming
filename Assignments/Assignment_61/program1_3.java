import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

class program1_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file : ");
        String source = sobj.nextLine();
        
        System.out.println("Enter the String: ");
        String data = sobj.nextLine();
        
        File fobj = new File(source.trim());

        if(fobj.exists())
        {
            FileOutputStream OS = new FileOutputStream(fobj,true);
        
            byte[] bdata = data.getBytes();

            OS.write(bdata);
            System.out.println("Data is written into file");
            OS.close();

        }
        else
        {
            System.out.println("There is no such file.");
        }


        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////
/////C:\Users\athar\Desktop\LBA\Assignment61>java program1_3.java
//Enter name of file :
//Demo.txt
//Enter the String:
//I love my country
//Data is written into file
//
///////////////////////////////////////////////////////////////////////////