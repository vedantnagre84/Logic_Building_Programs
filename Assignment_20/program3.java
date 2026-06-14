import java.util.Scanner;

class LogicX 
{
    boolean CheckPerfectNumber(int iNo)
    {
        int iCnt=0;
        int iFactors=0;
        for(iCnt=1;iCnt<iNo;iCnt++)
        {
             if(iNo%iCnt==0)
             {
                iFactors=iFactors+iCnt;
             }
             if(iFactors==iNo)
             {
                return true;
             }
        }
        return false; 
    }
}

class program3
{
    public static void main(String A[])
    {
        int iValue=0;
        boolean bRet=false;

        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the number to check whether its perfect of not :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        bRet=lobj.CheckPerfectNumber(iValue); 
        if(bRet==true)
        {
            System.out.println("The number is perfect!");
        }
        else
        {
            System.out.println("The number is not perfect!");
        }

    }
}