import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class program1_5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String source = sobj.nextLine();

        
        File fobj = new File(source.trim());

        try 
        {

            FileInputStream IS = new FileInputStream(fobj);

            System.out.println("File successfully opened.");
            IS.close();
        
        } 
        catch (FileNotFoundException e) 
        {

            if(!fobj.exists()) {
                System.out.println("File does not exist!");
                System.exit(0);
            }
            if(!fobj.exists()) {
                System.out.println("File does not exist");
                System.exit(0);
            }


            if(fobj.isDirectory()) {
                System.out.println("It is a Directory");
                System.exit(0);
            }
            if(fobj.isDirectory()) {
                System.out.println("It is a Directory");
                System.exit(0);
            }


            if(!fobj.canRead()) {
                System.out.println("File is not readabl");
                System.exit(0);
            }
            if(!fobj.canRead()) {
                System.out.println("File is not readabl");
                System.exit(0);
            }

        }
        catch (IOException e)
        {
            System.out.println("An unexpected error occurred: "+ e.getMessage());
        }
        catch (SecurityException e) 
        {
            System.out.println("Access Denied: You do not have permission to read this file.");
        }


        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////
////C:\Users\athar\Desktop\LBA\Assignment62>java program1_5.java
///Enter the name of file :
//Assignment65
//Filedoes not exist
//
///C:\Users\athar\Desktop\LBA\Assignment62>java program1_5.java
//Enter the name of file :
//LB.txt
//File successfully opened.
//
///C:\Users\athar\Desktop\LBA\Assignment62>java program1_5.java
//Enter the name of file :
//Original_Backup.ext
//File successfully opened.
//
///////////////////////////////////////////////////////////////////////////