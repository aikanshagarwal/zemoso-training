package LDPJava1;
import java.io.*;
public class FileOutput {
    public static void main(String[] args) {

        try
        {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hello there , my name is Aikansh Agarwal.");
            pw.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
