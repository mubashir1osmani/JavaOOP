class armstrong_recursion
{
    boolean armstrong(int n)
    {
        if(n == cube(n))
        return true;
        else
        return false;
    }
    int cube(int n)
    {
        if(n==0)
        return 0;
        else
        return (n%10)*(n%10)*(n%10)+cube(n/10);
    }
}