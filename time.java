//
import java.util.*;
class time
{
    int h,m,s;
    Scanner ob = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter hours: ");
        h = ob.nextInt();
        System.out.println("Enter minutes: ");
        m = ob.nextInt();
        System.out.println("Enter Seconds: ");
        s = ob.nextInt();
    }
    void print()
    {
        System.out.println(h+":"+m+":"+s);
    }
    time add(time a, time b)
    {
        time c = new time();
        c.h = a.h+b.h;
        c.m = a.m+b.m;
        c.s = a.s+b.s;
        if(c.s>=60)
        {
            c.s = c.s-60;
            c.m = c.m+1;
        }
        if(c.m>=60)
        {
            c.h = c.h+1;
            c.m = c.m-60;
        }
        return c;
    }
    void main()
    {
        time a = new time();
        time b = new time();
        time c = new time();
        a.accept();
        b.accept();
        c = a.add(a,b);
        a.print();
        b.print();
        System.out.println("Total Time: ");
        c.print();
    }
}