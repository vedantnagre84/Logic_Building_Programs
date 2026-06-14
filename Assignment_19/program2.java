import java.util.Scanner;
class LogicX
{
    void CalculateGrade(int iNo)
    {
        if(iNo>=90)
        {
            System.out.println("Your grade is :A");
        }
        else if(iNo>=75)
        {
            System.out.println("Your grade is :B");
        }
        else if(iNo>=40)
        {
            System.out.println("Your grade is :C");
        }
        else if(iNo>=25)
        {
            System.out.println("Your grade is :D");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
public class program2 
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        LogicX lobj=new LogicX();
        System.out.println("Enter your marks :");
        iValue=sobj.nextInt();
        lobj.CalculateGrade(iValue);
    }
}
