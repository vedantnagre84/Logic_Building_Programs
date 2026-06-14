import java.util.Scanner;
class LogicX
{
    void PrintDigits(int iNo)
    {
        int iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            System.out.println(iDigit);
            iNo=iNo/10;
        }
    }    
}
public class program4
{
    public static void main(String A[])    
    {
        int iValue=0;
        
        Scanner sobj=new Scanner(System.in);

        LogicX lobj=new LogicX();

        System.out.println("Enter the number to print its each digits separately :");
        iValue=sobj.nextInt();

        lobj.PrintDigits(iValue);
    }
}
