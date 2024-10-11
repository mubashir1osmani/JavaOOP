//
class octal
{
    int octal(int n)
    {
        int s=0;
        if(n==1) return 1;
        s = n%8+octal(n/8)*8;
        return s;
    }
}