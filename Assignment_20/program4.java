import java.util.Scanner;
 
class LogicX 
{
    int FindLargestDigit(int iNo)
    {
        int iDigit=0;
        int iMax=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iMax<iDigit)
            {
               iMax =iDigit;
            }
            iNo=iNo/10;
        }
        return iMax;
    }
}
public class program4 
{
    public static void main(String A[])
    {
        int iValue=0;
        int iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        iRet=lobj.FindLargestDigit(iValue);
        System.out.println("The largest digit is :"+iRet);

    }    
}
