import java.util.Scanner;

class LogicX
{
    int SumDigits(int iNo)
    {
        
        int iDigit=0;
        int iSum=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iSum=iSum+iDigit;
            iNo=iNo/10;
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

        System.out.println("Enter the number to find sum of all its digits :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        iRet=lobj.SumDigits(iValue);

        System.out.println("Sum of Digits is :"+iRet);
    }
}
