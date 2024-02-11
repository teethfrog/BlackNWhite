import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class ImageHandling {

    static String fileName = "Square" + LocalDate.now();

    public static RenderedImage generateImage(){
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bufferedImage.createGraphics();
        g.setBackground(Color.white);
        return bufferedImage;
    }

    public static void writeImage(RenderedImage imageData) throws IOException {

        ImageIO.write(imageData , "png", new File(fileName  + ".png"));
    }


}
