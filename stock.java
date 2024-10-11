class stock
{
    String item;
    int qty, rate, amt;
    stock(String a, int b, int c)
    {
        item = a;
        qty = b;
        rate = c;
        amt = qty*rate;
    }
    void display()
    {
        System.out.println("Name: "+item);
        System.out.println("Quantity: "+qty);
        System.out.println("Rate: "+rate);
        System.out.println("AMount: "+amt);
    }
}