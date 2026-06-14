import java.util.Scanner;

class LogicX
{
    void CheckNumber(int iNo)
    {
        if(iNo==0)
        {
            System.out.println("The number is zero!");
        }
        else if(iNo<0)
        {
            System.out.println("The number is Negative!");
        }
        else
        {
            System.out.println("The number is Positive!");
        }
    }
}
public class program5
{
    public static void main(String a[])
    {
        int iValue=0;
        
        Scanner sobj=new Scanner(System.in);
        LogicX lobj=new LogicX();
 
        System.out.println("Enter a number to find its positive, negative or zero :");
        iValue=sobj.nextInt();
        
        lobj.CheckNumber(iValue);

    }    
}


