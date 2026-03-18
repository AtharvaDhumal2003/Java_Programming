import java.io.File;
import java.util.*;

class program1_2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        long iMax = 0;
        int j = 0;

        System.out.println("Enter tha directory name/path : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            iMax = files[0].length();

            for(int i = 0; i < files.length; i++)
            {   
                if(files[i].length() > iMax) 
                {
                    iMax = files[i].length();
                    j = i;
                }
            }
           
            System.out.println("Name of largest file by size is : "+files[j].getName());

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
//Name of largest file by size is : Marvellous3.txt
/////////////////////////////////////////////////////////////////////