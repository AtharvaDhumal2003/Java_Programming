import java.util.*;
import java.io.File;

class program1_1
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

                if (files != null ) 
                {
                    for (int i = 0; i < files.length; i++) 
                    {
                        if(files[i].isFile())
                        {
                            System.out.println(files[i].getName());
                        }
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
//Demo.txt
////PPA.txt
//program1_1.java
///program1_2.java
//program1_3.java
//program1_4.java
//program1_5.java5
/////////////////////////////////////////////////////////////////////////////
