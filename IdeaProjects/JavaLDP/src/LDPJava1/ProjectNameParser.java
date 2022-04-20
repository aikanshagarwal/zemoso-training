package LDPJava1;
import java.util.*;
public class ProjectNameParser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        int space=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==' ')
            {
                space = i;
            }
        }

        String firstname = name.substring(0,space);
        String lastname = name.substring(space+1);

        System.out.println("First name is :" + firstname.toUpperCase() + " last name is : " + lastname.toLowerCase());

    }
}
