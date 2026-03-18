import java.io.File;
import java.util.*;

class program1_1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        long iSum = 0;

        System.out.println("Enter tha directory name/path : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            for(int i = 0; i < files.length; i++)
            {                
                 iSum = iSum + (files[i].length()); 
            }

        }
        else
        {
            System.out.println("There is no such directory.");
        }

        System.out.println("Total size of all files is : "+iSum+" bytes");

        sobj.close();
    }
}
//////////////////////////////////////////////////////////////////////
/////Enter tha directory name/path :
///Marvellous
//Total size of all files is : 49542 bytes
/////////////////////////////////////////////////////////////////////