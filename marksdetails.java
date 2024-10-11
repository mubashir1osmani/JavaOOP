class marksdetails extends Studentdetails
{
    int regnum, marks;
    String subject;
    void inputdetails2(String a, String b, int c, int d, int e, String f)
    {
        super(a,b,c);
        regnum = d;
        marks = e;
        subject = f;
    }
    void show()
    {
        System.out.println("Register number :"+regnum);
        System.out.println("Marks Obtained: "+marks);
        
    }
    void main()
    {
        marksdetails a = new marksdetails();
        a.show1();
        a.show2();
    }
}