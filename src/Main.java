import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        Robot bot = new Robot();
        Rectangle rectangle = getBorder.getRectangle();
        BufferedImage screen =
        bot.createScreenCapture(rectangle);
        ImageIO.write(screen,"jpg",new File("test1.jpg"));
//        int x = getBorder.getBorderXdown(),
//            y = getBorder.getBorderYdown();
//        bot.mouseMove(x,y);
    }
}