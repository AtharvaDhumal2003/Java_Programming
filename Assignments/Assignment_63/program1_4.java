import java.io.*;
import java.util.*;

class program1_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name/path : ");
        String str = sobj.nextLine();

        File Directory = new File(str);


        if(Directory.exists() && Directory.isDirectory())
        {
            File[] files = Directory.listFiles();
            File Text = new File("Combined.bin");

            if(Text.createNewFile())
            {
                System.out.println("File is created.");
            }
            else
            {
                System.out.println("Unable to create File.");
            }

            FileOutputStream OS = new FileOutputStream(Text, true);

            BufferedOutputStream bobj = new BufferedOutputStream(OS);

                if (files != null ) 
                {
                    for (int i = 0; i < files.length; i++) 
                    {
                        FileInputStream IS = new FileInputStream(files[i]);
                        BufferedInputStream bsobj = new BufferedInputStream(IS);

                        byte[] buffer = new byte[1024];

                        int data;

                        while ((data = bsobj.read(buffer)) != -1) 
                        {
                            bobj.write(buffer, 0, data);
                        }

                        bsobj.close(); 

                        bobj.write("\n\n".getBytes());
                    }

                    bobj.close();

                    System.out.println("Data is written in file.");

                }
        }
        else
        {
            System.out.println("Ther is no such directory.");
        }
        
    }
}
////////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignment58>java program1_4.java
//Enter the directory name/path :
//Folder1
//File is created.
//Data is written in file.
/////////////////////////////////////////////////////////////////////////////
