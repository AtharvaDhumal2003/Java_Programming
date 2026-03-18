import java.io.*;
import java.util.*;

class program1_5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of the new file: ");
        String str = sobj.nextLine();
                   
        File Text = new File(str);
        File cobj = new File("Combined.bin");
    
        if(Text.createNewFile()) {
            System.out.println("File created.");
        }

        if(cobj.exists() && cobj.isFile())
        {
            FileInputStream IS = new FileInputStream(cobj);
            BufferedInputStream bsobj = new BufferedInputStream(IS);

            FileOutputStream OS = new FileOutputStream(Text, true);
            BufferedOutputStream bobj = new BufferedOutputStream(OS);

            byte[] buffer = new byte[1024]; 


            int data = bsobj.read(buffer);

            if(data != -1) 
            {
                bobj.write(buffer, 0, data);
            }

            System.out.println("1kb successfully copied.");
            bsobj.close();
            bobj.close();
        }
        else
        {
            System.out.println("Source file 'Combined.bin' not found.");
        }
    }
}
////////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignment58>java program1_4.java
//Enter the name of the new file:
//ABC.txt
//File created.
//1kb successfully copied.
/////////////////////////////////////////////////////////////////////////////
