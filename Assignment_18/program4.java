import java.util.Scanner;

class LogicX
{
    void SumEvenOddDigits(int iNo)
    {
        int iDigit=0;
        int iEvenSum=0;
        int iOddSum=0;

        while(iNo!= 0)
        {
            iDigit=iNo%10;

            if(iDigit%2==0)
            {
                iEvenSum=iEvenSum+iDigit;
            }
            else
            {
                iOddSum=iOddSum+iDigit;
            }

            iNo=iNo/10;
        }

        System.out.println("Sum of Even Digits : "+iEvenSum);
        System.out.println("Sum of Odd Digits  : "+iOddSum);
    }
}

class program4
{
    public static void main(String A[])
    {
        int iValue=0;

        Scanner sobj=new Scanner(System.in);
        LogicX lobj=new LogicX();

        System.out.println("Enter a number : ");
        iValue=sobj.nextInt();

        lobj.SumEvenOddDigits(iValue);

         
    }
}