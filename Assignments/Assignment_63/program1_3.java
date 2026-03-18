import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;

class program1_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the source directory name/path : ");
        String source = sobj.nextLine();

        System.out.println("Enter the destination directory name/path : ");
        String dest = sobj.nextLine();

        File Directory = new File(source);
        File Directory1 = new File(dest);

        if(Directory.exists() && Directory.isDirectory())
        {
            File[] files = Directory.listFiles();
      
            for(int i = 0; i < files.length; i++) 
            {
                if(files[i].isFile())
                {
                    File targetFile = new File(Directory1,files[i].getName());

                    Files.copy(files[i].toPath(),targetFile.toPath(),StandardCopyOption.REPLACE_EXISTING);

                    System.out.println("Files Successfully copied into destination directory.");
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
//C:\Users\athar\Desktop\LBA\Assignment63>java program1_3.java
//Enter the source directory name/path :
//Marvellous
//Enter the destination directory name/path :
//Folder1
//Files Successfully copied into destination directory.
/////////////////////////////////////////////////////////////////////////////
