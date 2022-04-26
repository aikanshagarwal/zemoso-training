package LDPJava1;

public class MultipleInheritance
{
    public static void main(String[] args)
    {

    }
}

interface Engine
{
    default String model(int id)
    {
        return "Defualt Engine";
    }
}

interface Vehicle
{
    default String model(int id)
    {
        return "Defualt Engine";
    }
}

class Car implements Engine , Vehicle
{

    public String model(int id)
    {
        return "Default car";
    }


}
