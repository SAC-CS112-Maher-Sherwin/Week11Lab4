package week11lab4;

public class Dice {
    
    public static int OneThrow(){
        int roll = 1 + (int) (Math.random() * 6);
        return roll;
    }
}
