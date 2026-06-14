import java.util.Scanner;

class LogicX
{
    void DisplayFactors(int iNo)
    {
        int iCnt=0;
        int iCount=0;
        
        for(iCnt=1;iCnt<iNo/2;iCnt++) 
        {
            if(iNo%iCnt==0)
            {
                iCount=iCount+iCnt;
            }
        }
        System.out.println(iCount);
    }
}

class program4
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number to find its factors :");
        iValue=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.DisplayFactors(iValue);
    }
}