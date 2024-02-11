import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        StringBuilder stringLine = new StringBuilder();
        for (int i=0; i < 50; i++){
            if(!stringLine.isEmpty()){
                System.out.println(stringLine);
                stringLine.delete(0, 100);
            }
            for (int y=0; y < 100; y++){
                stringLine.append(Utils.coinFlip());
            }
        }

        ImageHandling.writeImage(ImageHandling.generateImage());
    }
}