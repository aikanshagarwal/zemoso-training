package LDPJava1;

// Java Program to Search for a File in a Directory
import java.io.*;
import java.util.Scanner;

// MyFilenameFilter class implements FilenameFilter
// interface
public class Assignment1Part2 implements FilenameFilter {

    String initials;


    // constructor to initialize object
    public Assignment1Part2(String initials) {
        this.initials = initials;
    }

    public void setInitials(String initials)
    {
        this.initials = initials;
    }

    // overriding the accept method of FilenameFilter
    // interface
    public boolean accept(File dir, String name) {
        return name.startsWith(initials);
    }


    public static void main(String[] args) {
        // Create an object of the File class
        // Replace the file path with path of the directory
        File directory = new File("/home/aikanshA");
        Scanner sc = new Scanner(System.in);
        int cont =0;
        // Create an object of Class Assignment1Part2
        // Constructor with name of file which is being
        // searched
        Assignment1Part2 filter
                = new Assignment1Part2("hello");

        while(cont==0)
        {
            System.out.print("Enter the initials of the files you want ot search:");
            String init = sc.nextLine();
            filter.setInitials(init);
            String[] flist = directory.list(filter);

            // store all names with same name
            // with/without extension


            // Empty array
            if (flist == null) {
                cont=0;
                System.out.println(
                        "Empty directory or directory does not exists.");
            } else {
                cont=0;
                // Print all files with same name in directory
                // as provided in object of Assignment1Part2
                // class
                for (int i = 0; i < flist.length; i++) {
                    System.out.println(flist[i] + " found");
                }
            }


            System.out.println("Do you want to search for more files? Enter 0 for yes and -1 for no.");
            cont = sc.nextInt();
            sc.nextLine();

        }


    }
}
