class magicsquare
{
    int n;
    magicsquare(int a)
    {
        n=a;
    }
    void create()
    {
        int i,r=0, c=n/2;
        int x[][] = new int[n][n];
        for(i=1;i<(n*n);i++)
        {
            x[r][c] = i;
            if(i%n==0)
            {
                r++;
            }
            else
            {
                r--;
            }
            if(r<0)
            r+=n;
            if(c<0)
            c+=n;
        }
        for(r=0;r<n;r++)
        {
            for(c=0;c<n;c++)
            {
                System.out.println(x[r][c]+" ");
            }
            System.out.println();
        }
    }
}