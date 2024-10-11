class area extends perimeter
{
    double h, area;
    area(double x, double y, double z)
    {
        super(x,y);
        h = z;
    }
    void doarea()
    {
        area = super.b*h;
    }
    void show()
    {
        System.out.println("Area: "+area);
    }
    void main()
    {
        area a = new area(4.5, 6.6, 7);
        super.calculate();
        super.show();
        a.doarea();
        a.show();
    }
}