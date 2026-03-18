import java.io.File;
import java.util.*;

class program1_5
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

                if (files != null) 
                {
                    for (int i = 0; i < files.length; i++) //for(File file : files)
                    {
                        System.out.println(files[i].getName() + " size: " + files[i].length());
                    }

                }
        }
        else
        {
            System.out.println("Ther is no such directory.");
        }
        
    }
}
////////////////////////////////////////////////////////////////////////////
//Enter the directory name/path :
//Marvellous
//Demo.txt        size : 38
//PPA.txt         size : 38
//program1_1.java         size : 2218
//program1_2.java         size : 856
//program1_3.java         size : 854
//program1_4.java         size : 866
//program1_5.java         size : 1215
/////////////////////////////////////////////////////////////////////////////
