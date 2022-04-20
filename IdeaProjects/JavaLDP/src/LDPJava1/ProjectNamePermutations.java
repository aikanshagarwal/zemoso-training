package LDPJava1;
import java.util.*;
public class ProjectNamePermutations {
    public static void main(String[] args) {

        String[] names = new String[5];
        int[] spaceindex = new int[5];

        ArrayList<String> firstname = new ArrayList<>();
        ArrayList<String> lastname = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++)
        {
            names[i] = sc.nextLine();
            spaceindex[i] = names[i].indexOf(' ');
            firstname.add(names[i].substring(0,spaceindex[i]));
            lastname.add(names[i].substring(spaceindex[i]+1));

        }

        for(int j = 0;j<firstname.size();j++)
        {
            for(int k =0;k<lastname.size();k++)
            {
                System.out.println(firstname.get(j) + " " + lastname.get(k));
            }
        }



    }
}
