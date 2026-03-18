import java.io.File;
import java.util.*;

class program1_3
{
    public static void main(String A[]) 
    {
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
                    System.out.println(files[i].getName());
                }
            }

        }
        else
        {
            System.out.println("There is no such directory."); 
        }

        sobj.close();

    }
}
//////////////////////////////////////////////////////////////////////
/////Enter tha directory name/path :
////Marvellous
//New folder
//New folder (2)
//New folder (3)
/////////////////////////////////////////////////////////////////////