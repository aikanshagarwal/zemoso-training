package LDPJava1;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Assignment11
{
    public static void main(String[] args)
    {

        String filename=args[0];
        String input="";

        try
        {
            Scanner sc = new Scanner(new File(filename));
            while(sc.hasNext())
            {
                input = sc.nextLine();
            }
            sc.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = input.toCharArray();

        for (char c : strArray)
        {
            if (charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }



        try
        {
            PrintWriter pw = new PrintWriter("output.txt");
            for (Map.Entry entry : charCountMap.entrySet())
            {
                pw.println(entry.getKey() + " " + entry.getValue());
            }
            pw.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}
