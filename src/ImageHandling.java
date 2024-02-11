import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandling {


    static String fileName;
    public static void setFileName(StringBuilder str){
        fileName = "Square" + str;
    }

    static int width;
    static int height;

//    public int getWidth() {
//        return width;
//    }

    public static void setWidth(int width) {
        ImageHandling.width = width;
    }

//    public int getHeight() {
//        return height;
//    }

    public static void setHeight(int height) {
        ImageHandling.height = height;
    }

    public static RenderedImage generateImage(){
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bufferedImage.createGraphics();
        g.setBackground(Color.white);
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                if (Utils.coinFlip() == 1){
                    g.fillRect(x, y, 1, 1);
                    g.setColor(Color.black);

                } else {
                    g.fillRect(x, y, 1, 1);
                    g.setColor(Color.white);
                }
            }
        }
        return bufferedImage;
    }

    public static void writeImage(RenderedImage imageData) throws IOException {

        ImageIO.write(imageData , "png", new File(fileName  + ".png"));
    }

}
