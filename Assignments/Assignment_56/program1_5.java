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

                if(files != null) 
                {
                    for(File file : files) 
                    {
                        System.out.println(file.getName());
                    }

                }
        }
        else
        {
            System.out.println("There is no such directory.");
        }
        
    }
}
////////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignmnet56>java program1_5.java
//Enter the directory name/path :
//Assignment
//Demo.txt
//PPA.txt
//program1_1.java
//program1_2.java
//program1_3.java
//program1_4.java
//program1_5.java
/////////////////////////////////////////////////////////////////////////////
