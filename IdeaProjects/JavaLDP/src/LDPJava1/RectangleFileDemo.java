package LDPJava1;
import java.awt.*;
import java.io.*;
import java.util.*;
public class RectangleFileDemo
{
    public static void main(String[] args)
    {
        ArrayList<RectangleFile> rectangleList = new ArrayList<>();
        fillArrayList(rectangleList);
        printArrayList(rectangleList);
        printArrayListtoFile(rectangleList);
    }

    public static void fillArrayList(ArrayList<RectangleFile> rf)
    {
        Scanner sc;
        try
        {
            sc = new Scanner(new File("rectangle_data.txt"));
            RectangleFile temp;
            double length;
            double width;
            while(sc.hasNext())
            {
                length = sc.nextDouble();
                width = sc.nextDouble();
                temp = new RectangleFile(length,width);
                rf.add(temp);
            }
            sc.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }

    public static void printArrayList(ArrayList<RectangleFile> rf)
    {
        for(RectangleFile recfile : rf)
        {
            System.out.println("Length :" + recfile.getLength());
            System.out.println("Width:"+ recfile.getWidth());
            System.out.println("Area:"+ recfile.area());
            System.out.println("Perimeter:"+ recfile.permiter()+ "\n");
        }
    }

    public static void printArrayListtoFile(ArrayList<RectangleFile> rf)
    {
        PrintWriter pw;
        try
        {
            pw = new PrintWriter("circles_output.txt");
            for(RectangleFile recfile : rf)
            {
                pw.println("Length :" + recfile.getLength());
                pw.println("Width:"+ recfile.getWidth());
                pw.println("Area:"+ recfile.area());
                pw.println("Perimeter:"+ recfile.permiter()+ "\n");
            }
            pw.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
