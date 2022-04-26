package LDPJava1;

public class DesignPattern_Factory
{
    public static void main(String[] args)
    {
        CycleFactory1 cf = new CycleFactory1();
        CycleNew1 cn = cf.sendchain("Bicycle");
        cn.chain();
    }
}


interface CycleNew1
{
    public void chain();
}

class BicycleNew1 implements CycleNew1
{
    @Override
    public void chain()
    {
        System.out.println("I am a Bicycle chain");
    }
}

class TricycleNew1 implements CycleNew1
{
    @Override
    public void chain()
    {
        System.out.println("I am a Tricycle chain");
    }
}

class UnicycleNew1 implements CycleNew1
{
    @Override
    public void chain()
    {
        System.out.println("I am a Unicycle chain");
    }
}

class CycleFactory1
{
    public CycleNew1 sendchain(String channel)
    {
        switch(channel)
        {
            case "Unicycle":
                return new UnicycleNew1();
            case "Bicycle":
                return new BicycleNew1();
            case "Tricycle":
                return new TricycleNew1();
            default:
                return null;
        }
    }
}
