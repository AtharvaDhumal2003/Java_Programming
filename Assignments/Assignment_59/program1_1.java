import java.io.File;
import java.util.*;

class program1_1
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
//Demo.txt
//Marvellous.txt
//Marvellous1.txt
//Marvellous2.txt
//Marvellous3.txt
//New folder
//New folder (2)
//New folder (3)
//PPA.txt
//program1_1.java
//program1_2.java
//program1_3.java
//program1_4.java
//program1_5.java
//Scenario_BasedS.lnk
/////////////////////////////////////////////////////////////////////