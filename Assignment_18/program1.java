import java.util.Scanner;
class LogicX
{
    boolean CheckPrime(int iNo)
{
    int iCnt = 0;


    if(iNo <= 1)
    {
        return false;
    }

    for(iCnt=2;iCnt<iNo/2;iCnt++)
    {
        if(iNo%iCnt==0)
        {
            return false;
        }
    }

    return true;
}
}
class program1
{
    public static void main(String A[])
    {
        int iValue=0; 
        boolean bRet=false;
        
        Scanner sobj=new Scanner(System.in);
        LogicX lobj=new LogicX();

        System.out.println("Enter the number to check prime :");
        iValue=sobj.nextInt();

        bRet=lobj.CheckPrime(iValue);

        if(bRet==true)
        {
            System.out.println("The number "+iValue+" is prime!");
        }
        if(bRet==false)
        {
            System.out.println("The number "+iValue+" is not prime!");
        }

    }

}