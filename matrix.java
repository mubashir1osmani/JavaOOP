import java.util.*;
class matrix
{
    int x[][] = new int[3][4];
    Scanner ob = new Scanner(System.in);
    void accept()
    {
        int r,c;
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.println("Enter value = ");
                x[r][c] = ob.nextInt();
            }
        }
    }
    matrix add(matrix a, matrix b)
    {
        matrix s = new matrix();
        int r,c;
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                s.x[r][c] = a.x[r][c]+b.x[r][c];
            }
        }
        return s;
    }
    void print()
    {
        int r,c;
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.println(x[r][c]+" ");
            }
            System.out.println();
        }
    }
    void main()
    {
        matrix a = new matrix();
        matrix b = new matrix();
        matrix c = new matrix();
        a.accept();
        b.accept();
        c = a.add(a,b);
        c.print();
    }
}