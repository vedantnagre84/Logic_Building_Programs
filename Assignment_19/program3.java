import java.util.Scanner;
class LogicX
{
    void CheckDivisible(int iNo)
    {
        if(iNo%5==0 && iNo%11==0)
        {
            System.out.println("The number is divisible by 5 as well as 11!");
        }
        else
        {
            System.out.println("The number is not divisible by either  5 or 11 or both!");
        }
    }
}
public class program3 
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        LogicX lobj=new LogicX();
        System.out.println("Enter the number to check wether it is divisible by 5 and 11 :");
        iValue=sobj.nextInt();
        lobj.CheckDivisible(iValue);
    }
}
