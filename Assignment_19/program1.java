import java.util.Scanner;

class LogicX
{
    void CheckLeapYear(int iNo)
    {
        if(iNo%4==0)
        {
            System.out.println("It is a Leap year!");
        }
        else
        {
            System.out.println("It is not a Leap year!");
        }
    }
}

class program1
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);

        LogicX lobj=new LogicX();
        System.out.println("Enter the year to check if its leap :");
        iValue=sobj.nextInt();
        
        lobj.CheckLeapYear(iValue);


    }
}