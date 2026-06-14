import java.util.Scanner;
class LogicX
{
    void printEvenNumber(int iNo)
    {
        int iCnt=0;

        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class program2
{
    public static void main(String A[])
    {
        int iValue=0;
        
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number to print Even numbers upto N :");
        iValue=sobj.nextInt();
       
        LogicX lobj=new LogicX();

        lobj.printEvenNumber(iValue);


        
    }
}