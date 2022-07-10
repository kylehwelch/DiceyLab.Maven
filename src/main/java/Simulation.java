import java.util.Arrays;

public class Simulation {
    public static void main(String[] args) {rollTheBones();}
    public static void rollTheBones() {
        Bins.rollArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 1000000; i++) {
            int bones = Dice.rollDice();
            if (bones == 2) {
                Bins.rollArray[0]++;
            } else if (bones == 3){
                Bins.rollArray[1]++;
            } else if (bones == 4){
                Bins.rollArray[2]++;
            } else if (bones == 5){
                Bins.rollArray[3]++;
            } else if (bones == 6){
                Bins.rollArray[4]++;
            } else if (bones == 7){
                Bins.rollArray[5]++;
            } else if (bones == 8){
                Bins.rollArray[6]++;
            } else if (bones == 9){
                Bins.rollArray[7]++;
            } else if (bones == 10){
                Bins.rollArray[8]++;
            } else if (bones == 11){
                Bins.rollArray[9]++;
            } else if (bones == 12){
                Bins.rollArray[10]++;
            }
        }
//        System.out.println(Arrays.toString(Bins.rollArray));

        System.out.println(
                "***\n" +
                "Simulation of 2 dice tossed 1000000 times.\n" +
                "***\n\n" +
                " 2 :   " + Bins.rollArray[0] + ":    " + percents(Bins.rollArray[0]) + seeStars(Bins.rollArray[0]) + "\n" +
                " 3 :   " + Bins.rollArray[1] + ":    " + percents(Bins.rollArray[1]) + seeStars(Bins.rollArray[1]) + "\n" +
                " 4 :   " + Bins.rollArray[2] + ":    " + percents(Bins.rollArray[2]) + seeStars(Bins.rollArray[2]) + "\n" +
                " 5 :  " + Bins.rollArray[3] + ":    " + percents(Bins.rollArray[3]) + seeStars(Bins.rollArray[3]) + "\n" +
                " 6 :  " + Bins.rollArray[4] + ":    " + percents(Bins.rollArray[4]) + seeStars(Bins.rollArray[4]) + "\n" +
                " 7 :  " + Bins.rollArray[5] + ":    " + percents(Bins.rollArray[5]) + seeStars(Bins.rollArray[5]) + "\n" +
                " 8 :  " + Bins.rollArray[6] + ":    " + percents(Bins.rollArray[6]) + seeStars(Bins.rollArray[6]) + "\n" +
                " 9 :  " + Bins.rollArray[7] + ":    " + percents(Bins.rollArray[7]) + seeStars(Bins.rollArray[7]) + "\n" +
                "10 :   " + Bins.rollArray[8] + ":    " + percents(Bins.rollArray[8]) + seeStars(Bins.rollArray[8]) + "\n" +
                "11 :   " + Bins.rollArray[9] + ":    " + percents(Bins.rollArray[9]) + seeStars(Bins.rollArray[9]) + "\n" +
                "12 :   " + Bins.rollArray[10] + ":    " + percents(Bins.rollArray[10]) +  seeStars(Bins.rollArray[10])
                );

    }
    public static String seeStars(int num){
        StringBuilder str = new StringBuilder("");
        int starNum = Math.round(num / 10000);
        for (int i = 0 ; i < starNum ; i++){
            str.append("*");
        }
        return str.toString();
    }

    public static String percents (double num){
        double per = (num / 1000000);
//        return Double.toString(per);
        return String.format("%.2f", per);

    }



}
