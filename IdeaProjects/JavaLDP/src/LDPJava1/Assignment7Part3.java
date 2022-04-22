package LDPJava1;

public class Assignment7Part3
{
    public static void main(String[] args)
    {
        Inherit obj = new Inherit();
        obj.methodA(obj);
        obj.methodB(obj);
        obj.methodC(obj);
        obj.methodD(obj);
    }
}

class Concrete
{

}

class Inherit extends Concrete implements A,B,C,D
{
    public void methodA(A obj)
    {

    }

    public void methodB(B obj)
    {

    }

    public void methodC(C obj)
    {

    }

    public void methodD(D obj)
    {

    }

    @Override
    public int sumA() {
        return 0;
    }

    @Override
    public int diffA() {
        return 0;
    }

    @Override
    public int sumB() {
        return 0;
    }

    @Override
    public int diffB() {
        return 0;
    }

    @Override
    public int sumC() {
        return 0;
    }

    @Override
    public int diffC() {
        return 0;
    }

    @Override
    public int sumD() {
        return 0;
    }
}

interface A
{
    int sumA();
    int diffA();
}

interface B
{
    int sumB();
    int diffB();
}

interface C
{
    int sumC();
    int diffC();
}

interface D extends A,B,C
{
    int sumD();
}
