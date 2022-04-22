package LDPJava1;

public class Assignment7Part4
{
    public static void main(String[] args)
    {
        CycleFactory cf = new CycleFactory();
        CycleNew cn = cf.sendchain("Bicycle");
        cn.chain();
    }
}

interface CycleNew
{
    public void chain();
}

class BicycleNew implements CycleNew
{
    @Override
    public void chain()
    {
        System.out.println("I am a Bicycle chain");
    }
}

class TricycleNew implements CycleNew
{
    @Override
    public void chain()
    {
        System.out.println("I am a Tricycle chain");
    }
}

class UnicycleNew implements CycleNew
{
    @Override
    public void chain()
    {
        System.out.println("I am a Unicycle chain");
    }
}

class CycleFactory
{
    public CycleNew sendchain(String channel)
    {
        switch(channel)
        {
            case "Unicycle":
                    return new UnicycleNew();
            case "Bicycle":
                    return new BicycleNew();
            case "Tricycle":
                    return new TricycleNew();
            default:
                    return null;
        }
    }
}
