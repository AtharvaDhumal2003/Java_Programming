import java.util.*;
import java.io.*;
import java.io.File;

class program1_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name to read data : ");
        String str = sobj.next();

        File fobj = new File(str);

        if(fobj.exists())
        {
            if(fobj.canWrite())
            {
                FileWriter Writer = new FileWriter(fobj,true);// true = append mode

                Writer.write(" From marvellous Infosystems");
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
            System.out.println("File not exists : "+str);
            return;
        }


    }
}
/////////////////////////////////////////////////////////////////////////////
/////Enter the file name to read data :
//Jay Ganesh From marvellous Infosystems
/////////////////////////////////////////////////////////////////////////////
