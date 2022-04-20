package LDPJava1;

import java.io.File; //use file related methods

import java.io.FilenameFilter;
import java.util.Scanner;  //use to take inputs

public class Assignment1{


    private void findFile()
    {


        File file = new File("/home/aikanshA");  // address of files where to search
        String str ;
        Scanner in = new Scanner(System.in);
        int ab =0;
        // do while is used to run the program and take input again and again
        do{

            System.out.println("ENTER THE NAME OF FILE: ");
            str =in.nextLine();

            String[] files = file.list();  //list of files present in the directory is stored in string array

            for (String string : files){         //continous check for each file or folder
                //check the name of file present or not and store in boolean str1

                Boolean str1 = str.equals(string);

                if (str1){  // str1 is true that means file is found
                    ab = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            //if file not found
            if(ab == 0)
            {
                System.out.println("File not find : Re enter the name of the file.");
            }
            else if(ab==1)
            {
                System.out.println("Do you want to search for more files? Enter 0 for yes and -1 for no.");
                ab = in.nextInt();
                in.nextLine();
            }

        }while(ab==0);
    }


    public static void main(String[] args){
        //object of Assignment1 class is created
        Assignment1 obj =new Assignment1();
        //calling the findFile() method
        obj.findFile();
    }


}