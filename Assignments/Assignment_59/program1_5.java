import java.io.File;
import java.util.*;

class program1_5
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
                System.out.println(files[i].getName());
                System.out.println("Absolute path of file is :");
                System.out.println(files[i].getAbsolutePath()+"\n");
                
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
///Enter tha directory name/path :
///Marvellous
//Demo.txt
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\Demo.txt
//
//Marvellous.txt
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\Marvellous.txt
//
//Marvellous1.txt
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\Marvellous1.txt
//
//Marvellous2.txt
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\Marvellous2.txt
//
//Marvellous3.txt
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\Marvellous3.txt
//
//New folder
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\New folder
//
//New folder (2)
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\New folder (2)
//
//New folder (3)
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\New folder (3)
//
//PPA.txt
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\PPA.txt
//
//program1_1.java
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\program1_1.java
//
//program1_2.java
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\program1_2.java
//
//program1_3.java
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\program1_3.java
//
//program1_4.java
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\program1_4.java
//
//program1_5.java
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\program1_5.java
//
//Scenario_BasedS.lnk
//Absolute path of file is :
//C:\Users\athar\Desktop\LBA\Assignment59\Marvellous\Scenario_BasedS.lnk
/////////////////////////////////////////////////////////////////////