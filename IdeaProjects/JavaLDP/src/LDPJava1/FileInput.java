package LDPJava1;

import java.io.*;
import java.util.Scanner;

public class FileInput
{
    public static void main(String[] args){
        Scanner sc;

        try
        {
            sc = new Scanner(new File("input.txt"));
            int input;
            while(sc.hasNext())
            {
                input = sc.nextInt();
                System.out.println(input);

            }
            sc.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
