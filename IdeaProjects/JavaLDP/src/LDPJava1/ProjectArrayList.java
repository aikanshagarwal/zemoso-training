package LDPJava1;
import java.util.*;
public class ProjectArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<>();
        double input=0;

        while(input>=0)
        {
            System.out.println("Enter a number greater or equal to 0 to put in the list , -1 for exiting:");
            input = sc.nextDouble();
            if(input>=0)
            {
                arrayList.add(input);
            }
            else
            {
                for(int i = arrayList.size()-1 ; i>=0;i--)
                {
                    System.out.println(arrayList.get(i));
                }
                break;
            }
        }



    }
}
