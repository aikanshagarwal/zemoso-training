package LDPJava1;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int freq[] = new int[256];
        String str = sc.nextLine();
        int asc;
        for(int i =0;i<str.length();i++)
        {
            asc = str.charAt(i);
            freq[asc]++;
        }

        for(int i=97,j=65;i<=122;i++,j++)
        {
            if(freq[i]==0 && freq[j]==0)
            {
                System.out.println("All the letters of the alphabet are not present.");
                return;
            }
        }

        System.out.println("All the letters of the alphabet are present.");

    }
/*the time complexity of the function will be O(n) since it will be traversing the entire length of the string for finding out the characters and storing it's frequency , the second loop will take constant time which can be neglected.
The space complexity will be of O(1) since we have created a constant sized frequency array which is not changing.
 */

}
