import java.util.Scanner;
 
class LogicX 
{
    void Pattern(int iNo)
    {
        int iCnt=0;
        int iDigit=0;
        
        for(iCnt=0 ,iDigit=iNo;iCnt<iNo;iCnt++,iDigit--)
        {
            System.out.print(iDigit+"\t"+"#\t");
        }
        System.out.println();
    }
}

public class program2
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.Pattern(iValue);
    }    
}
