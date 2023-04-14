package utilits;

import java.util.Random;

public class UtilRandomFW {
    public static int getCasualNumber(int num){
        Random random = new Random();
        int casualNum;
        casualNum=random.nextInt(num);
        return casualNum;

    }
}

