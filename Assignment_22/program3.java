import java.util.Scanner;

class LogicX
{
    void Pattern(int iNo)
    {
        int iCnt=0;
        int iDigit=0;
        for(iCnt=1,iDigit=1;iCnt<iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iDigit+"\t");
                iDigit++;
            }
            
        }
    System.out.println();
    }
}

class program3
{
    public static void main(String A[])
    {
        int iValue;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.Pattern(iValue);
    }
}