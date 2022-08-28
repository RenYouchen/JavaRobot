package opencv;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.core.Core;
import org.opencv.highgui.HighGui;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.opencv.highgui.HighGui.waitKey;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;
import static org.opencv.imgcodecs.Imgcodecs.imread;

public class opencv {
    public static void init() throws MalformedURLException {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println(Core.VERSION);
        File file = new File("test1.jpg");
        String path = file.getAbsolutePath();
        Mat img = imread(path);
        img = imread(path,IMREAD_GRAYSCALE);
        HighGui.imshow("name",img);
        waitKey(1000);
        System.exit(0);
    }
}
