import java.util.Scanner;
class LogicX
{
    boolean CheckPalindrome(int iNo)
    {
        int iDigit=0;
        int iRev=0;
        int iTemp=iNo;
        
        while(iNo!=0)   //121
        {
            iDigit=iNo%10;
            iRev=(iRev * 10)+iDigit;
            iNo=iNo/10;
        }
        if(iTemp==iRev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program2
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        boolean bRet=false;

        int iValue=0;

        LogicX lobj=new LogicX();

        System.out.println("Enter the number to check palindrome :");
        iValue=sobj.nextInt();
        
        bRet=lobj.CheckPalindrome(iValue);


        if(bRet==true)
        {
            System.out.println("The number "+ iValue+" is a palindrome!");
        }
        else
        {
            System.out.println("The number "+ iValue+" is not a palindrome!");
        }

    }
}