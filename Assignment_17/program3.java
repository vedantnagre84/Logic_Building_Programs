import java.util.Scanner;
class LogicX
{
    public void CheckMax(int iNo1, int iNo2)
    {
        if(iNo1>iNo2)
        {
            System.out.println(iNo1+" is maximum number!");
        }
        else
        {
            System.out.println(iNo2+" is maximum number!");
        }
    }

}
class program3
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);

        LogicX lobj=new LogicX();

        int iValue1=0;
        int iValue2=0;
        int iRet=0;
        
        System.out.println("Enter the first number :");
        iValue1=sobj.nextInt();

        System.out.println("Enter the second number :");
        iValue2=sobj.nextInt();

         lobj.CheckMax(iValue1,iValue2);
         




    }
}