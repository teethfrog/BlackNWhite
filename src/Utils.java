import java.util.Random;

public class Utils {

    static Random random = new Random();
        public static int coinFlip() {
            return random.nextInt(0,2);
        }

}
