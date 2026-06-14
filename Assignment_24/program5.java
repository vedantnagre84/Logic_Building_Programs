import java.util.Scanner;

class LogicX
{
    void Pattern(int iRow,int iCol)

    {
        int i=0;
        int j=0;
        int iCount=1;
         

        for(i =0;i<=iRow;i++ )
        {
            for(j=1;j<=iCol;j++)
            {
               
                System.out.print(iCount+"\t");
                iCount++;
            }
            System.out.println();
        }
    }
}

class program5
{
    
    public static void main(String[] args)
    {


        int iValue1=0;
        int iValue2=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter number of rows :");
        iValue1=sobj.nextInt();

        System.out.println("Enter number of columns :");
        iValue2=sobj.nextInt();

        LogicX lobj=new LogicX();

        lobj.Pattern(iValue1,iValue2);

    } 


}