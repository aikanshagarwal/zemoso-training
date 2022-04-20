package LDPJava1;
import java.util.*;
public class RandomNumber
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt();
        System.out.println(randomNumber);

        randomNumber = random.nextInt(1000); //will limit from 0 to 999
        System.out.println(randomNumber);

        randomNumber = random.nextInt() + 1;  //BETWEEN 1 AND 1000
        System.out.println(randomNumber);

    }
}
