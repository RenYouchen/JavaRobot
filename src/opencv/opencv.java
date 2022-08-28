package opencv;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.core.Core;
import org.opencv.highgui.HighGui;

import java.net.MalformedURLException;
import java.net.URL;

public class opencv {
    public static void init() throws MalformedURLException {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println(Core.VERSION);
        URL filePath = new URL("../test.jpg");
        Mat img = Imgcodecs.imread(filePath.getPath());
        HighGui.imshow("name",img);
    }
}
