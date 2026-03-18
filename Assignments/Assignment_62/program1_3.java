import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class program1_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String source = sobj.nextLine();

        System.out.println("Enter number of bytes you want to read.");
        int iSize = sobj.nextInt();

        String str = "B.txt";


        File fobj = new File(source.trim());
        File fobj1 = new File(str.trim());

        int data = 0;
        long byteSkip = fobj.length() - iSize;

        if(fobj.exists())
        {
            FileInputStream IS = new FileInputStream(fobj);

            if(byteSkip > 0)
            {
                IS.skip(byteSkip);
            }
            
            if(fobj1.createNewFile())
            {
                FileOutputStream OS = new FileOutputStream(fobj1);

                if(fobj.length() < iSize)
                {
                    System.out.println("File size is small than your required bytes.");
                }

                while((data = IS.read()) != -1)
                {
                        OS.write(data);
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
////C:\Users\athar\Desktop\LBA\Assignment62>java program1_3.java
//Enter the name of file :
//LSP.txt
//Enter number of bytes you want to read.
//10
//Data successfully written into file.
//
///////////////////////////////////////////////////////////////////////////