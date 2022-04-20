package LDPJava1;

public class RectangleFile
{
   private double length;
   private double width;

   public RectangleFile()
   {
       this(1.0,1.0);
   }

   public RectangleFile(double length , double width)
   {
       this.length = length;
       this.width = width;
   }

   public double getLength()
   {
       return length;
   }

   public double getWidth()
   {
       return width;
   }

   public void setLength(double length)
   {
       this.length = length;
   }

   public void setWidth(double width)
   {
       this.width = width;
   }

   public double permiter()
   {
       return 2*(length+width);
   }

    public double area()
    {
        return (length*width);
    }
}
