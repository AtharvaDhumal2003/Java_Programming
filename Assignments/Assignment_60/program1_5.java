import java.io.File;
import java.util.*;

class program1_5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the path : ");
        String path = sobj.nextLine();
        

        File fobj = new File(path);

        if(fobj.exists())
        {
           if(fobj.isDirectory())
           {
                System.out.println("It is a Directory.");
           }
           else if(fobj.isFile())
           {
              System.out.println("It is a File.");  
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
//Enter the path :
//C:\Users\athar\Desktop\LBA\Assignment60\Marvellous
//It is a Directory.
////
//Enter the path :
//C:\Users\athar\Desktop\LBA\Assignment60\program1_1.java
//It is a File.
/////////////////////////////////////////////////////////////////////