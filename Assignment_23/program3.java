import java.util.Scanner;

class PatternX
{
    void Pattern(int iRow,int iCol)
    {
         
        int i=0;
        int j=0;

        for(i=0;i<=iRow;i++)
        {
            for(j=iCol;j>=1;j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

class program3
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

        PatternX lobj=new PatternX();

        lobj.Pattern(iValue1,iValue2);
    }
}