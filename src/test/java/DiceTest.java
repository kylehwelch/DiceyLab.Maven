import org.testng.Assert;
import org.testng.annotations.Test;

public class DiceTest {
    @Test
    public void testRoll(){
        for (int i = 0 ; i < 1000 ; i++) {
            int actual = Dice.rollDice();
            Assert.assertTrue(actual <= 12 && actual >= 2);
            System.out.println(actual);
        }
    }
    @Test
    public void testStars(){
        String expected = "************";
        String actual = Simulation.seeStars(127000);

        Assert.assertEquals(actual, expected);
    }

}
