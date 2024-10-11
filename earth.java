//
import java.util.*;
class earth
{
    String n; int rno; char gender;
    void accept()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter Name :");
        n = ob.next();
        System.out.println("Enter Roll No: ");
        rno = ob.nextInt();
        System.out.println("Enter Gender: ");
        gender = ob.next().charAt(0);
    }
    void print()
    {
        System.out.println("Name :"+n);
        System.out.println("ROll NO: "+rno);
        System.out.println("Gender :"+gender);
    }
}
