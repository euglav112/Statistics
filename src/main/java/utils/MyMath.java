/**
 * Created by 461 on 14.04.2016.
 */
package utils;

import java.util.Random;

public class MyMath {
    public static int getRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
