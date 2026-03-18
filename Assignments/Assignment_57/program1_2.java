import java.util.*;
import java.io.File;;

class program1_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        String str = sobj.next();

        File myoBj = new File(str);

        if(myoBj.isFile())
        {
            System.out.println("File is with name "+str+" is regular file");
        }
        else
        {
            System.out.println("File is not a regular file");
        }

    }
}
/////////////////////////////////////////////////////////////////////////////
///C:\Users\athar\Desktop\LBA\Assignment57>java program1_2.java
//Enter the file name :
//PPA.txt
//File is with name PPA.txt is regular file
/////////////////////////////////////////////////////////////////////////////
