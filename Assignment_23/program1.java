import java.util.Scanner;

class LogicX
{
    void Pattern(int iRow,int iCol)
    {
         
        int i=0;
        int j=0;

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

class program1
{
    public static void main(String A[])
    {
        int iValue1=0;
        int iValue2=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter number of rows :");
        iValue1=sobj.nextInt();

        System.out.println("Enter the number of columns :");
        iValue2=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.Pattern(iValue1,iValue2);
    }
}