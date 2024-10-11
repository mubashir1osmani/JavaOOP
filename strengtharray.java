class strengtharray
{
    String s;
    strengtharray(String x)
    {
        s=x;
    }
    void calc()
    {
        s = s.toUpperCase();
        String x[] = s.split(" ");
        int i,j, l=x.length, t=0; String st=" ";
        int y[] = new int[l];
        for(i=0;i<l;i++)
        {
            y[i] = strength(x[i]);
        }
        for(i=0;i<l;i++)
        {
            for(j=0;j<l-1;j++)
            {
                if(y[j]>y[j+1])
                {
                    t=y[j]; y[j]=y[j+1]; y[j+1] = t;
                    st = x[j]; x[j] = x[j+1]; x[j+1] = st;
                }
            }
        }
        for(i=0;i<l;i++)
        System.out.print(x[i]+" ");
    }
    int strength(String s)
    {
        int i, l=s.length(), sum=0;
        for(i=0;i<l;i++)
        {
            sum = sum+s.charAt(i)-64;
        }
        return sum;
    }
}