import java.util.*;
import java.io.File;;

//checksum
class program1_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name : ");
        String str = sobj.next();

        File myoBj = new File(str);

        if(myoBj.mkdir())
        {
            System.out.println("Directory is created successfully.");
        }
        else
        {
            System.out.println("unable to create directory.");
        }

    }
}
/////////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignment57>java program1_3.java
//Enter the directory name :
//Marvellous
//Directory is created successfully.
/////////////////////////////////////////////////////////////////////////////
