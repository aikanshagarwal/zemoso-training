package LDPJava1;
import java.io.*;
import java.util.*;
public class FileOutput2 {
    public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("John");
    al.add("Aikansh");
    al.add("Raju");
    al.add("Farhan");
        try
        {
            PrintWriter pw = new PrintWriter("output2.txt");

            for(String name : al)
            {
                pw.println(name);
            }
            pw.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
