//
class products
{
    int prod(int n)
    {
        if(n==0)
        return 1;
        else
        return n%10*prod(n/10);
    }
}