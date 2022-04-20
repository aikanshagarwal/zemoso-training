package LDPJava1;
import java.util.*;
public class ProjectMADLIB {

    public static void main(String[] args) {
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an adjective: ");
        adjective1 = sc.nextLine();
        System.out.println("Enter a girl's name: ");
        girlsName = sc.nextLine();
        System.out.println("Enter an adjective: ");
        adjective2 = sc.nextLine();
        System.out.println("Enter an occupation: ");
        occupation = sc.nextLine();
        System.out.println("Enter a place name: ");
        placeName = sc.nextLine();
        System.out.println("Enter a clothing: ");
        clothing = sc.nextLine();
        System.out.println("Enter an hobby: ");
        hobby= sc.nextLine();
        System.out.println("Enter an adjective: ");
        adjective3 = sc.nextLine();
        System.out.println("Enter an occupation: ");
        occupation2= sc.nextLine();
        System.out.println("Enter a boy's name: ");
        boysName = sc.nextLine();
        System.out.println("Enter a man's name: ");
        mansName = sc.nextLine();

        System.out.println("There was once a " + adjective1 + " girl named " + girlsName + " ,who was a " + adjective2 + " " + occupation + " in the Kingdom of " + placeName + ".");
        System.out.println("She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the "+ adjective3 + " " + occupation2 + " named " + boysName +" but her father ,King , " + mansName + " forbid her from seeing him.");


    }
}
