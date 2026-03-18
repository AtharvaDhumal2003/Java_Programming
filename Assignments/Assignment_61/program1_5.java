import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class program1_5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file : ");
        String source = sobj.nextLine();
        
        System.out.println("Enter the name of destination file1 : ");
        String dest1 = sobj.nextLine();

        System.out.println("Enter the name of destination file2 : ");
        String dest2 = sobj.nextLine();
        
        int data = 0;
        long halfSize = 0;

        File fobj = new File(source.trim());
        File fobj1 = new File(dest1.trim());
        File fobj2 = new File(dest2.trim());

        halfSize = (fobj.length())/2;
        int i = 0;

        if(fobj.exists())
        {
            FileInputStream IS = new FileInputStream(fobj);

            FileOutputStream OS = new FileOutputStream(fobj1);
            FileOutputStream OS1 = new FileOutputStream(fobj2);

            while((data = IS.read()) != -1)
            {
                if(i < halfSize)
                {
                    OS.write(data);
                    i++;
                }
                else
                {
                    OS1.write(data);
                    break;
                }
            }

            while((data = IS.read()) != -1)
            {
                OS1.write(data);
            }

            System.out.println("Data is successfully copied from source to destination");

            OS.close();
            OS1.close();
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
/////C:\Users\athar\Desktop\LBA\Assignment61>java program1_5.java
//Enter the name of source file :
//Marvellous.txt
//Enter the name of destination file1 :
//LB.txt
//Enter the name of destination file2 :
//PPA.txt
//Data is successfully copied from source to destination
//
///////////////////////////////////////////////////////////////////////////