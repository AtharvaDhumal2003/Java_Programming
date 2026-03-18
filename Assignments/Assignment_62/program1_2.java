import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class program1_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String source = sobj.nextLine();

        System.out.println("Enter number of bytes you want to read.");
        int iSize = sobj.nextInt();

        String str = "A.txt";


        File fobj = new File(source.trim());
        File fobj1 = new File(str.trim());

        int data = 0;
        int i = 0;

        if(fobj.exists())
        {
            FileInputStream IS = new FileInputStream(fobj);
            
            if(fobj1.createNewFile())
            {
                FileOutputStream OS = new FileOutputStream(fobj1);

                if(fobj.length() < iSize)
                {
                    System.out.println("File size is small than your required bytes.");
                }

                while((data = IS.read()) != -1)
                {
                    if(i <= iSize)
                    {
                        OS.write(data);
                    }
                    i++;
                }

                System.out.println("Data successfully written into file.");

            }
            else
            {
                System.out.println("Unable to create new file.");
                IS.close();
            }

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
////C:\Users\athar\Desktop\LBA\Assignment62>java program1_2.java
//Enter the name of file :
//LB.txt
//Enter number of bytes you want to read.
//10
//Data successfully written into file.
//
///////////////////////////////////////////////////////////////////////////