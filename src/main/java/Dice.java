import java.util.Random;


public class Dice {
    public static int rollDice(){
        Random rand = new Random();
        int dice1 = (rand.nextInt(6)+1);
        int dice2 = (rand.nextInt(6)+1);
        return dice1+dice2;
    }
}
