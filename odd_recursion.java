class odd_recursion
{
    void print(int n)
    {
        if(n>=1)
        {
            if(n%2==1)
            System.out.println(n+" ");
            System.out.print(n-1);
        }
    }
}