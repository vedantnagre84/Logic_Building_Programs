import java.util.Scanner;
class LogicX
{   
    int PrintEven(int iNo)
    {
        int iCnt=0;
        int iSum=0;
        
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                iSum=iSum+iCnt;
            }
        }
        return iSum;
    }
}
class program1
{
    public static void main(String A[])
    {
        int iValue=0;
        int iRet=0;

        Scanner sobj=new Scanner(System.in);

        LogicX lobj=new LogicX();

        System.out.println("Enter the number to print sum of even number until it :");
        iValue=sobj.nextInt();

        iRet=lobj.PrintEven(iValue);
        System.out.println("Sum of even numbers upto N is :"+iRet);


    }
}