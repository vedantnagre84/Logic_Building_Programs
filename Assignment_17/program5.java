import java.util.Scanner;
class LogicX
{
    void Table(int iNo)
    {
        int iTable=0;
        int iCnt=0;

        for(iCnt=1;iCnt<=10;iCnt++)
        {
            System.out.println(iCnt*iNo);
        }
         
    }
}
public class program5 
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        LogicX lobj=new LogicX();

        int iValue=0;
     

        System.out.println("Enter the number to write table of it :");
        iValue=sobj.nextInt();

         lobj.Table(iValue);

         
    }    
}
