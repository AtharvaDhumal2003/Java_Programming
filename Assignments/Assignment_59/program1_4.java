import java.io.File;
import java.util.*;

class program1_4
{
    public static void main(String A[]) 
    {
        int fileCount = 0, folderCount = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter tha directory name/path : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            for(int i = 0; i < files.length; i++)
            {
                if(files[i].isDirectory())
                {
                    folderCount++;
                }
                else if(files[i].isFile())
                {
                    fileCount++;
                }
            }

        }
        else
        {
            System.out.println("There is no such directory."); 
        }

        System.out.println("Total number of files are : "+fileCount);
        System.out.println("Total number of folders are : "+folderCount);

        sobj.close();

    }
}
//////////////////////////////////////////////////////////////////////
/////Enter tha directory name/path :
//Marvellous
//Total number of files are : 12
//Total number of folders are : 3
/////////////////////////////////////////////////////////////////////