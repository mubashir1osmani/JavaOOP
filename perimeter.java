class perimeter
{
    double a, b;
    perimeter(double x, double y)
    {
        a = x;
        b = y;
    }
    double calculate()
    {
        return 2*(a+b);
    }
    void show()
    {
        System.out.println("length= "+a+"breadth= "+b+"perimeter= "+calculate());
    }
}