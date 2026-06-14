import java.util.Scanner;
class LogicX
{
    void CheckMin(int iNo1,int iNo2,int iNo3)
    {
        if(iNo1<=iNo2 && iNo1<=iNo3)
        {
            System.out.println("Minimum number is :"+iNo1);
        }
        else if(iNo2<=iNo1 && iNo1<=iNo3)
        {
            System.out.println("Minimum number is :"+iNo2);
        }
        else
        {
            System.out.println("Minimum number is :"+iNo3);
        }
        
    }

}
public class program4 
{
    public static void main(String A[])
    {
        int iValue1=0,iValue2=0,iValue3=0;

        LogicX lobj=new LogicX();

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first number :");
        iValue1=sobj.nextInt();

        System.out.println("Enter the second number :");
        iValue2=sobj.nextInt();

        System.out.println("Enter the third number :");
        iValue3=sobj.nextInt();


        lobj.CheckMin(iValue1,iValue2,iValue3);



        
    }    
}
