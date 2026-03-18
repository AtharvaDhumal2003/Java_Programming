import java.io.File;
import java.util.*;

class program1_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name to read data : ");
        String str = sobj.next();

        File fobj = new File(str);

        if(fobj.exists())
        {
            if(fobj.canRead())
            {
                Scanner Reader = new Scanner(fobj);

                System.out.println("The Data from file is : ");
                while(Reader.hasNextLine())
                {
                    String Data = Reader.nextLine();
                    System.out.println(Data);
                }

                Reader.close();
            } 
            else 
            {
                System.out.println("The file is not readable.");
                return;
            }


        }
        else
        {
            System.out.println("File not exists : "+str);
            return;
        }


    }
}
/////////////////////////////////////////////////////////////////////////////
/////Enter the file name to read data :
//Demo.txt
//The Data from file is : 
//Jay Ganesh
//
//C:\Users\athar\Desktop\LBA\Assignmnet56>java program1_2.java
//Enter the file name to read data :
//PPA.txt
//File not exists : PPA.txt
/////////////////////////////////////////////////////////////////////////////
