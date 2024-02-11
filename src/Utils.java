import java.util.ArrayList;
import java.util.Random;

public class Utils {

    static Random random = new Random();
        public static int coinFlip() {
            return random.nextInt(0,2);
        }

        public static ArrayList<Integer> parseInput(String input) {
            ArrayList<Integer> parameters = new ArrayList<Integer>();
            String[] parametersParsed = input.split(",");
            for (String parameter : parametersParsed) {
                parameters.add(Integer.parseInt(parameter));
            }
            return parameters;
        }

}
