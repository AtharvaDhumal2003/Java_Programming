import java.io.File;
import java.util.*;

class program1_3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        long iMin = 0;
        int j = 0;

        System.out.println("Enter tha directory name/path : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            iMin = files[0].length();

            for(int i = 0; i < files.length; i++)
            {   
                //if(files[i].isFiles())
                if(iMin > files[i].length()) 
                {
                    iMin = files[i].length();
                    j = i;
                }
            }
           
            System.out.println("Name of smallest file by size is : "+files[j].getName());

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
///Marvellous
//Name of smallest file by size is : New folder
/////////////////////////////////////////////////////////////////////