//
import java.util.*;
class Tower_of_Hanoi
{
    int Ndiscs;
    Tower_of_Hanoi(int nd)
    {
        Ndiscs = nd;
    }
    void Rec_Disc_Shift(int disc, String StartPole, String MidPole, String EndPole)
    {
        if(disc == 1)
        System.out.println("Move Disc "+ disc + "from" + StartPole + "to" + EndPole);
        else
        {
            Rec_Disc_Shift(disc - 1, StartPole, EndPole, MidPole); //recursive function
            System.out.println("Move Disc " + disc + "from " + StartPole+ "to " + EndPole);
            Rec_Disc_Shift(disc-1, MidPole, StartPole, EndPole);
        }
    }
    void display()
    {
        Rec_Disc_Shift(Ndiscs, "FirstPole", "MiddlePole", "LastPole");
    }
    void main()
    {
        Scanner ob = new Scanner(System.in);
        int discs = ob.nextInt();
        Tower_of_Hanoi obj = new Tower_of_Hanoi(discs);
        obj.display();
    }
}