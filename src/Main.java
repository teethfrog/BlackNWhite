import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            str.append(Utils.coinFlip());
            ImageHandling.setFileName(str);
        }

        System.out.println("Provide a width and a height in the format: X,Y");
        String parameters = input.nextLine();

        ImageHandling.setWidth(Utils.parseInput(parameters).get(0));
        ImageHandling.setHeight(Utils.parseInput(parameters).get(1));




        ImageHandling.writeImage(ImageHandling.generateImage());
    }
}