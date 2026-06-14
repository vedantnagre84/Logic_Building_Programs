import java.util.Scanner;

class LogicX 
{
    void ReverseOrder(int iNo)
    {
        int iCnt=0;
        for(iCnt=iNo;iCnt>=1;iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class program2
{
    public static void main(String A[])
    {
        int iValue=0;

        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number to print in reverse order :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.ReverseOrder(iValue);

    }
}