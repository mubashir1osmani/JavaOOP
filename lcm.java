//
class lcm
{
    int lcm(int a, int b, int x)
    {
        if(a%b==0)
        return a;
        else
        return lcm(a+x, b, x);
    }
}