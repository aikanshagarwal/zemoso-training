package LDPJava1;

import java.lang.management.BufferPoolMXBean;

public class Assignment7Part2
{
    public static void main(String[] args)
    {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        Cycle[] arr = new Cycle[5];
        arr[1] =new Bicycle();
        arr[2] =new Tricycle();
        arr[3] =new Unicycle();
        //arr[1].balance();
        //arr[2].balance();
        //arr[3].balance();

        Bicycle t1 = (Bicycle) new Cycle();
        Unicycle u1 = (Unicycle) new Cycle();
        t1.balance();
        u1.balance();

    }
}

class Cycle
{

}

class Unicycle extends Cycle
{
    void balance()
    {

    }
}

class Bicycle extends Cycle
{
    void balance()
    {

    }
}

class Tricycle extends Cycle
{

}
