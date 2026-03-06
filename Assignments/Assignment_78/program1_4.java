import  java.util.*;

class program1_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Charge = 0;

        System.out.println("Enter Miniutes : ");
        int Miniute = sobj.nextInt();

        if(Miniute < 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        if(Miniute <= 5)
        {
            Charge = 0;
        }
        else if(Miniute <= 15)
        {
            Charge = (Miniute - 5) * 1;
        }
        else if(Miniute > 15)
        {
            Charge = 10 + ((Miniute - 15) * 2);
        }

        System.out.println("Call Duration : "+Miniute);
        System.out.println("Total Call Charge : "+Charge);

       
        sobj.close();

    }
}

////////////////////////////////////////////////////////////////////////
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_4.java
//Enter Miniutes :
//-2
//Invalid Input.
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_4.java
//Enter Miniutes :
//0
//Call Duration : 0
//Total Call Charge : 0
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_4.java
//Enter Miniutes :
//5
//Call Duration : 5
//Total Call Charge : 0
//
//C:\Users\athar\Desktop\LBA\Assignment78>java program1_4.java
//Enter Miniutes :
//8
//Call Duration : 8
//Total Call Charge : 3

//C:\Users\athar\Desktop\LBA\Assignment78>java program1_4.java
//Enter Miniutes :
//32
//Call Duration : 32
///Total Call Charge : 44
////////////////////////////////////////////////////////////////////////
 