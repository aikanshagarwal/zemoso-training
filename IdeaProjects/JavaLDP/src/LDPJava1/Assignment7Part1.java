package LDPJava1;

public class Assignment7Part1
{
    public static void main(String[] args)
    {
       //Rodent r = new Rodent();
       // r.eat();
        Mouse m = new Mouse();
        m.eat();

        Rat r1 = new Rat();
        r1.eat();
        System.out.println();
        Rodent[] arr = new Rodent[3];
        arr[1] = new Mouse();
        arr[2] = new Rat();
        arr[1].drink();
        arr[2].drink();
    }
}

abstract class Rodent
{
    Rodent()
    {
        System.out.println("Hello I am a rodent.");
    }
    public void eat()
    {
        System.out.println("Hello I am a Rodent and I eat cheese!");
    }

    public abstract void drink();
}

class Mouse extends Rodent
{

    Mouse()
    {
        System.out.println("Hello , I am a mouse.");
    }
    @Override
    public void eat()
    {
        super.eat();
        System.out.println("Hello I am a Mouse,I am small in size and I eat cheese!");
    }

    @Override
    public void drink() {
        System.out.println("Hello I am a Mouse,I am small in size and I drink milk!");
    }
}

class Rat extends Rodent
{
    Rat()
    {
        System.out.println("Hello , I am a Rat.");
    }
    @Override
    public void eat()
    {
        super.eat();
        System.out.println("Hello I am a Rat,I am large in size and I eat cheese!");
    }

    @Override
    public void drink() {
        System.out.println("Hello I am a Rat,I am large in size and I drink milk!");
    }
}
