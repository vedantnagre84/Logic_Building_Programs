import java.util.Scanner;
 
class LogicX 
{
    int FindSmallestDigit(int iNo)
    {
         int iDigit = 0;
        int iMin = 9;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            iNo = iNo / 10;
        }

        return iMin;
    }
}
public class program5
{
    public static void main(String A[])
    {
        int iValue=0;
        int iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        iRet=lobj.FindSmallestDigit(iValue);
        System.out.println("The smallest digit is :"+iRet);

    }    
}
