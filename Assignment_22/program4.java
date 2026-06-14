import java.util.Scanner;

class LogicX
{
    void Pattern(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<iNo;iCnt++)
        {
            System.out.print("#\t"+iCnt+"\t"+"*\t");
        }
        System.out.println();
    }
}

class program4
{
    public static void main(String A[])
    {
        int iValue=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();
        lobj.Pattern(iValue);
    }
}