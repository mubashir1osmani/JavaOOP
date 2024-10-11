class happy_recursion
{
    int s=0;
    boolean method(int n)
    {
        if(sum(n)==1)
        return true;
        else
        return false;
    }
    int sum(int n)
    {
        if (n==0)
        return 0;
        s = (n%10)+sum(n/10);
        return s;
    }
}