class hamming
{
    int a,b,s;
    hamming(int c, int d)
    {
        a=c;
        b=d;
    }
    void calc()
    {
        int i;
        int ba = binary(a);
        int al = Integer.toString(ba).length();
        int bb = binary(b);
        int bl = Integer.toString(bb).length();
        String large, small;
        if(al>bl)
        {
            large =  Integer.toString(ba); small = Integer.toString(ba);
        }
        else
        {
            large = Integer.toString(bb); small = Integer.toString(ba);
        }
        System.out.println("Binary equivalent = "+large+" "+small);
        for(i=1;i<=Math.abs(al-bl);i++)
        {
            small = "0"+small;
        }
        int count = 0;
        for(i=0;i<large.length();i++)
        {
            if(large.charAt(i)!=small.charAt(i))
            count++;
        }
        System.out.println("Hamming distance = "+count);
    }
    int binary(int n)
    {
        if(n==0)return 0;
        else
        s = n%2+10*binary(n/2);
        return s;
    }
}