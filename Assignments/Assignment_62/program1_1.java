import java.io.File;
import java.io.FileInputStream;
import java.util.*;

class program1_1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String source = sobj.nextLine();
           
       
        File fobj = new File(source.trim());
        int data = 0;
        int i = 0;

        if(fobj.exists())
        {
            FileInputStream IS = new FileInputStream(fobj);

            while((data = IS.read()) != -1)
            {
                i++;
            }

            System.out.println(i+" bytes sucessfully readed from file.");

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
////C:\Users\athar\Desktop\LBA\Assignment62>java program1_1.java
//Enter the name of file :
//LB.txt
//2985 bytes sucessfully readed from file.
//
///////////////////////////////////////////////////////////////////////////