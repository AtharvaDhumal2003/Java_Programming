import java.util.*;
import java.io.File;

class program1_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        String str = sobj.next();

        File myoBj = new File(str);

        if(myoBj.exists())
        {
            System.out.println("File already exixsts");
        }
        else
        {
            if(myoBj.createNewFile())
            {
                System.out.println("File is created with name : "+str);
            }
            else
            {
                System.out.println("Unable to create file");
            }
        }
        
    }
}
/////////////////////////////////////////////////////////////////////////////
///C:\Users\athar\Desktop\LBA\Assignmnet56>java program1_4.java
//Enter the file name :
//Demo.txt
//File already exixsts
//
///C:\Users\athar\Desktop\LBA\Assignmnet56>java program1_4.java
//Enter the file name :
///PPA.txt
//File is created with name : PPA.txt
/////////////////////////////////////////////////////////////////////////////
