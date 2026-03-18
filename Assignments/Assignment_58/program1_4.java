import java.util.*;
import java.io.*;
import java.io.File;

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
            File Text = new File("Marvellous/Marvellous2.txt");

            if(Text.createNewFile())
            {
                System.out.println("File is created.");
            }
            else
            {
                System.out.println("Unable to create File.");
            }
            FileWriter Writer = new FileWriter(Text,true);

                if (files != null ) 
                {
                    for (int i = 0; i < files.length; i++) 
                    {                    
                        Scanner Reader = new Scanner(files[i]);

                        Writer.write(files[i].getName()+"\n");
                        while(Reader.hasNextLine())
                        {
                            String Data = Reader.nextLine();
                            Writer.write(Data + "\n");
                        }

                        Writer.write("\n");
                        Writer.write("\n");
                    }

                    System.out.println("Data is written in file.");
                    Writer.close();

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
//Marvellous
//File is created.
//Data is written in file.
/////////////////////////////////////////////////////////////////////////////
