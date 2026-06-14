import java.util.Scanner;

class LogicX
{
    void Pattern(int iNo)
    {
        int iCnt=0;
        char ch='\0';
        for(iCnt=0,ch='A';iCnt<iNo;iCnt++,ch++)
        {
             
            System.out.print(ch+"\t");
        }
        System.out.println();
        
    }
}

class program1
{
    public static void main(String A[])
    {
        int iValue=0;
        
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.Pattern(iValue);


    }
}