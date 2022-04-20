package LDPJava1;

import java.util.Random;

public class Dice {
    public static void main(String[] args)
    {
        Random random = new Random();
        int dice;
        dice = random.nextInt(6) + 1;       //generates from 0 to 5, adding 1 to the output of that
        System.out.println(dice);

    }
}
