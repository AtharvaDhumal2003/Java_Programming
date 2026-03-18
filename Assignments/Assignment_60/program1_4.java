import java.io.File;
import java.util.*;

class program1_4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter tha directory name/path : ");
        String str = sobj.nextLine();
        
        System.out.println("Enter the extension of files that you want :(.txt etc) ");
        String extension = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            for(int i = 0; i < files.length; i++)
            {   
                
                if(files[i].getName().endsWith(extension))
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
/////C:\Users\athar\Desktop\LBA\Assignment60>java program1_4.java
//Enter tha directory name/path :
//Marvellous
//Enter the extension of files that you want :(.txt etc)
//.txt
//Demo.txt
//Marvellous.txt
//Marvellous1.txt
//Marvellous2.txt
//Marvellous3.txt
//PPA.txt
//////
//C:\Users\athar\Desktop\LBA\Assignment60>java program1_4.java
//Enter tha directory name/path :
//Marvellous
//Enter the extension of files that you want :(.txt etc)
//.lnk
//Scenario_BasedS.lnk
/////////////////////////////////////////////////////////////////////