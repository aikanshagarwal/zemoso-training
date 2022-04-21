package LDPJava1;

public class Assignment8
{
    public static void excep() throws Exception
    {
            //int a = 5/0;
            int arr[] = new int[6];
            //int b = arr[6];
            String ptr = null;
            if(ptr.equals("gfg"))
            {
                //do something
            }

    }
    public static void main(String[] args)
    {
        try
        {
            excep();
        }
        catch(Exception ex)
        {
            System.out.println("Exception occurred," + ex.getMessage());
        }
        finally
        {
            System.out.println("Exiting program safely");
        }
    }
}
