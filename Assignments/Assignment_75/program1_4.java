import java.util.*;

class program1_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Fine = 0;

        System.out.println("Does biker has Helmet?");
        String Helmet = sobj.next();
        
        System.out.println("Does bicker has Lincence?");
        String Lincense = sobj.next();
        
        System.out.println("Does biker is Overspeeding?");
        String OverSpeeding = sobj.next();

        if
        (
            ((Helmet.equalsIgnoreCase("Yes") == false) && 
            (Helmet.equalsIgnoreCase("No") == false))
            ||
            ((Lincense.equalsIgnoreCase("Yes") == false) && 
            (Lincense.equalsIgnoreCase("No") == false))
            ||
            ((OverSpeeding.equalsIgnoreCase("Yes") == false) && 
            (OverSpeeding.equalsIgnoreCase("No") == false))
        )
        {
            System.out.println("Invalid input.");
            return;
        }

        if(Helmet.equalsIgnoreCase("No") == true)
        {
            Fine = Fine + 500;
        }

        if(Lincense.equalsIgnoreCase("No") == true)    
        {
            Fine = Fine + 1000;
        }
           
        if (OverSpeeding.equalsIgnoreCase("Yes") == true)
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount : "+Fine);
        
        sobj.close();
    }
}
/////////////////////////////////////////////////////////////////////////
///Does biker has Helmet?
//no
//Does bicker has Lincence?
//yes
//Does biker is Overspeeding?
//no
//Total Fine Amount : 500
/////////////////////////////////////////////////////////////////////////