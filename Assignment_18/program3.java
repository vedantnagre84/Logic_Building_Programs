import java.util.Scanner;
class LogicX
{
    void printOddNumber(int iNo)
    {
        int iCnt=0;
        
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            if(iCnt%2!=0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program3
{
    public static void main(String A[])
    {
        int iValue=0;

        Scanner sobj=new Scanner(System.in);
        
        LogicX lobj= new LogicX();

        System.out.println("Enter the number to print odd numbers upto N :");
        iValue=sobj.nextInt();

        lobj.printOddNumber(iValue);




    }
}