import java.util.*;
class can 
{
    int n, m;
    Scanner sc = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter number of Candies: ");
        n = sc.nextInt();
        System.out.println("Enter number of Kids: ");
        m = sc.nextInt();
    }
    int calc()
    {
        int total_candy = fact(n);
        int each_candy = total_candy/m;
        int candies_left = (total_candy%m);
        return candies_left;
    }
    
    void main()
    {
        int t=0;
        System.out.println("Enter Test cases: "+t);
        t = sc.nextInt();
        accept();
        for(int i=1;i<=t;i++)
        {
            System.out.println("Case #"+i+":"+calc());
            if(i==2)
            System.exit(0);
            accept();
        }
    }
    int fact(int n)
    {
        int i, f=0;
        for(i=1;i<=n;i++)
        f+=i;
        return f;
    }
}