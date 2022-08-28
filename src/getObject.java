import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class getObject {
    public static void processPhoto(String fileName) throws IOException {
        BufferedImage photo = ImageIO.read(new File(fileName));

    }
}
