//
class power
{
    int power(int a, int b)
    {
        if(b==0)
        return 1;
        else
        return (a*power(a,b-1));
    }
}