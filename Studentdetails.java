class Studentdetails
{
    String name, sex;
    int age;
    void inputdetails1(String a, String b, int c)
    {
        name = a;
        sex = b;
        age = c;
    }
    void show1()
    {
        System.out.println("Name of the student :"+name);
        System.out.println("Age :"+age);
        System.out.println("Gender:"+sex.charAt(0));
    }
}