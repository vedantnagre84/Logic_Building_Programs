 import java.util.Scanner;

 class LogicX
 {
    void DisplayNumbers(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<iNo;iCnt++)
        {
            if((iCnt%2==0) && (iCnt%3==0))
            {
                System.out.println(iCnt);
            }
        }
    }
 }

 class program5
 {
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.DisplayNumbers(iValue);
    }
 }