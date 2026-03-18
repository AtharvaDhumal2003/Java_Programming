import java.io.*;
import java.util.*;

class program1_1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first file name : ");
        String first = sobj.next();
        
        System.out.println("Enter the Second file name : ");
        String second = sobj.next();

        File fobj = new File(first);
        File fobj2 = new File(second);

        if(fobj2.createNewFile())
        {
            System.out.println("File is created with name : "+second);
        }
        else
        {
            System.out.println("Unable to create file");
        }


        if(fobj.exists())
        {   
            if(fobj.canRead())
            {   
                if(fobj.canWrite())
                {
                    FileWriter Writer = new FileWriter(fobj2,true);// true = append mode
                 
                    Scanner Reader = new Scanner(fobj);
                
                    while(Reader.hasNextLine())
                    {
                        String Data = Reader.nextLine();
                        Writer.write(Data);
                    }

                    Reader.close();
                    System.out.println("Data is written in file.");
                    Writer.close();
                } 
                else 
                {
                    System.out.println("The file is not writable..");
                    return;
                }
            } 
            else 
            {
                System.out.println("Unable to read from file.");
                return;
            }


        }
        else
        {
            System.out.println("File not exists : "+first);
            return;
        }


    }
}
/////////////////////////////////////////////////////////////////////////////
//Enter the first file name :
//Demo.txt
//Enter the Second file name :
//PPA.txt
//File is created with name : PPA.txt
//The Data from file is :
//Data is written in file.
/////////////////////////////////////////////////////////////////////////////
