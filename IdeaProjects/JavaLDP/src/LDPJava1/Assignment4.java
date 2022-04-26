package LDPJava1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.lang.*;

public class Assignment4
{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        int inp = sc.nextInt();
        sc.nextLine();
        String[] signupdate = new String[inp];
        String[] currentdate = new String[inp];
        Calendar[] signupdate1=new Calendar[inp];
        Calendar[] currentdate1=new Calendar[inp];
        for(int i=0;i<inp;i++)
        {
            System.out.println("Enter the " + (i+1) + "st/nd/th signup date in the format dd/mm/yyyy:");
            signupdate[i] = sc.nextLine();
            date = sdf.parse(signupdate[i]);
            signupdate1[i] = Calendar.getInstance();
            signupdate1[i].setTime(date);
            System.out.println("Enter the " + (i+1) + "st/nd/th current date in the format dd/mm/yyyy:");
            currentdate[i] = sc.nextLine();
            date = sdf.parse(currentdate[i]);
            currentdate1[i] = Calendar.getInstance();
            currentdate1[i].setTime(date);

        }

        for(int i=0;i<inp;i++)
        {
            if(signupdate1[i].compareTo(currentdate1[i])>0)
            {
                System.out.println("No range");
            }
            else
            {
                signupdate1[i].set(Calendar.YEAR,currentdate1[i].get(Calendar.YEAR));
                System.out.println("Time range for given date is:");
                signupdate1[i].add(Calendar.DATE,-30);
                System.out.println(signupdate1[i].getTime()+ "\nto");
                signupdate1[i].add(Calendar.DATE, 60);
                System.out.println(signupdate1[i].getTime());
                System.out.println();

            }
        }
        

    }

}
