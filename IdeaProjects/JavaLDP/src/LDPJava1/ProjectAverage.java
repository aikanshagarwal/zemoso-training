package LDPJava1;
import java.util.*;
public class ProjectAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.nextLine();
        double avg;
        avg = (a+b+c)/3.0;
        System.out.print("Average is: " + avg);

    }

}
