 
class Logic
{

    void SumOfDigit(int iNo)
    {
        int iCnt=0;
        int iCount=0;
        int iDigit=0;
        
        while (iNo!=0)
        {
            iDigit=iNo%10;
            iCount=iCount+iDigit;
            iNo=iNo/10;
        }
        System.out.println(iCount);
    }
}



class program1
{
    public static void main(String A[])
    {
        int iRet=0;
        
        Logic lobj=new Logic();
        lobj.SumOfDigit(1234);
        
        

    }
}