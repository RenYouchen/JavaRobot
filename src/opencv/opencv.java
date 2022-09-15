package opencv;
import org.opencv.core.Mat;
import org.opencv.core.Core;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import static org.opencv.highgui.HighGui.*;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgproc.Imgproc.*;

public class opencv {
    public static void init() throws MalformedURLException {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println(Core.VERSION);

        Mat img = imread("test1.bmp");
        Mat canny = new Mat();
        Imgproc.cvtColor(img,canny,COLOR_BGR2GRAY);
//        Imgproc.Canny(img,canny,100,1);
        HighGui.imshow("img",img);
        HighGui.imshow("canny",canny);
        waitKey(0);
        System.exit(0);
    }
    public static void getScreenShot() throws AWTException, IOException {
        Robot bot = new Robot();
        Rectangle rectangle = new Rectangle(1366,768);
        BufferedImage screen =
        bot.createScreenCapture(rectangle);
        ImageIO.write(screen,"bmp",new File("screenShot.bmp"));
    }
}
