import java.util.Scanner;

class LogicX
{
    void CheckOddEven(int iNo)
    {
        int iCnt=0;
        int iOdd=0;
        int iEven=0;
        int iDigit=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iDigit%2==0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
            iNo=iNo/10;
        }
        System.out.println("Even :"+iEven);
        System.out.println("Odd :"+iOdd);
      
    }

}

 class program2
 {
    public static void main(String A[])
    {
        int iValue=0;
        int iRet=0;

        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number to check how many even and odd numbers are present in it :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.CheckOddEven(iValue);


    }
 }