package LDPJava1;

public class Assignment5Part1
{

    int a;
    char b;
    /*Assignment5Part1(int a , char b)
    {
        this.a =a ;
        this.b = b;
    }*/

    void printvariables()
    {
        System.out.println("The variables are :" + a + " and " + b);
    }

    /*void printlocalvariables()
    {
        int a;
        char b;
        System.out.println("The variables are :" + a + " and " + b);
    }*/


    public static void main(String[] args)
    {
        Assignment5Part1 obj = new Assignment5Part1();
        obj.printvariables();
        //obj.printlocalvariables();
    }

    /* In the above functions , without initialising the variables , garbage values will be printed for class variables since the default constructor initialises them.
    While , in the case of local variables inside the print local variables function , the code won't run at all because the values for a and b are not specified and not initialised at all.

     */
}
