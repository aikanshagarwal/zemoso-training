package LDPJava1;
import java.util.Scanner;
public class ProjectPackages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int packagenumber;
        int numberofcourses;
        int basecost;
        int costpercourse;
        int numincluded;
        int totalcost;

        System.out.println("Which of the packages you want? 1,2, or 3:");
        packagenumber = sc.nextInt();
        System.out.println("How many courses you enrolled this month?");
        numberofcourses = sc.nextInt();

        if(packagenumber==1)
        {
            basecost = 10;
            costpercourse = 6;
            numincluded = 2;
        }
        else if(packagenumber==2)
        {
            basecost = 12;
            costpercourse = 4;
            numincluded = 4;
        }
        else
        {
            basecost = 15;
            costpercourse = 3;
            numincluded = 6;
        }

        if(numberofcourses>numincluded)
        {
            totalcost = basecost + (numberofcourses - numincluded) * costpercourse;
        }
        else
        {
            totalcost = basecost;
        }

        System.out.println("Total cost is:" + totalcost);
    }
}
