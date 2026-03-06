import java.util.*;

class program1_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        double TotalBill = 0.0;
        double InsurenceCover = 0.0;

        System.out.println("Enter numbe of Days : ");
        int Days = sobj.nextInt();

        System.out.println("Enter your medicine bill : ");
        int MedicineBill = sobj.nextInt();

        System.out.println("Enter consultation fees : "); 
        int ConsultationFees = sobj.nextInt();

        if(Days < 0 || MedicineBill < 0 || ConsultationFees < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Enter your wardType : ");
        String WardType = sobj.next();

        if(WardType.equalsIgnoreCase("Normal") && WardType.equalsIgnoreCase("ICU"))
        {
            System.out.println("Invalid Input.");
            return;
        }

        System.out.println("Are you Insured : (Yes/No)");
        String Insured = sobj.next();

        if(WardType.equalsIgnoreCase("Normal"))
        {
            TotalBill = ConsultationFees + MedicineBill + (Days * 2000);
        }
        else
        {
            TotalBill = ConsultationFees + MedicineBill + (Days * 5000);
        }

        if(Insured.equalsIgnoreCase("Yes"))
        {
            InsurenceCover = 0.0;
            double cover2 = (TotalBill * 0.7);

            if(cover2 < 50000)
            {
                InsurenceCover = cover2;
            }
            else
            {
                InsurenceCover = 50000;
            }

        }

        System.out.println("Total Bill : "+TotalBill);
        System.out.println("InsuranceCover : "+InsurenceCover);
        System.out.println("Final Pay : "+(TotalBill - InsurenceCover));


        sobj.close();
   
    }
}

/////////////////////////////////////////////////////////////////////
///C:\Users\athar\Desktop\LBA\Assignment77>java program1_1.java
//Enter numbe of Days :
//8
//Enter your medicine bill :
//10000
//Enter consultation fees :
//8000
//Enter your wardType :
//Normal
//Are you Insured : (Yes/No)
//yes
//Total Bill : 34000.0
//InsuranceCover : 23800.0
//Final Pay : 10200.0
/////////////////////////////////////////////////////////////////////////