package LDPJava1;

public class Assignment5Part2
{
    String str1 = new String();

    public static Assignment5Part2 initialise(String str)
    {
        Assignment5Part2 obj = new Assignment5Part2();
        obj.str1 = str;
        return obj;
    }

    public void print()
    {
        System.out.print(str1);
    }
    public static void main(String[] args)
    {
        Assignment5Part2 newobj = initialise("Hello");
        newobj.print();

    }
}
