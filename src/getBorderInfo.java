import java.awt.*;

public class getBorderInfo {
    static Robot bot;

    static {
        try {
            bot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    public static int getBorderXup() throws AWTException {
        int x=0;
        for (int i = 0; i < screen.width ; i++) {
            if(String.valueOf(bot.getPixelColor(i, screen.height/2)).equals("java.awt.Color[r=128,g=143,b=140]")){
                x=i;
                break;
            }
        }
        return x;
    }
    public static int getBorderYup() throws AWTException {
        int y=0,count=0;
        for (int i = 0; i < screen.height ; i++) {
            if(String.valueOf(bot.getPixelColor(100, i)).equals("java.awt.Color[r=128,g=143,b=140]")){
                count++;
                if (count==5){
                    y=i;
                    break;
                }
            }
        }
        return y;
    }
    public static int getBorderXdown() throws AWTException {
        int x=0,count=0;
        for (int i = 0; i < screen.width ; i++) {
            if(String.valueOf(bot.getPixelColor(i, screen.height/2)).equals("java.awt.Color[r=128,g=143,b=140]")){
                count++;
                if (count==2){
                    x=i;
                    break;
                }
            }
        }
        return x;
    }
    public static int getBorderYdown() throws AWTException {
        int y=0,count=0;
        for (int i = 0; i < screen.height ; i++) {
            if(String.valueOf(bot.getPixelColor(100, i)).equals("java.awt.Color[r=128,g=143,b=140]")){
                count++;
                if (count==6){
                    y=i;
                    break;
                }
            }
        }
        return y;
    }
    public static int getWidth() throws AWTException {
        int width;
        int n1 = getBorderXup(),
            n2 = getBorderXdown();
        width = n2 - n1;
        return width;
    }

    public static int getHeight() throws AWTException {
        int height;
        int n1 = getBorderYup(),
                n2 = getBorderYdown();
        height = n2 - n1;
        return height;
    }

    public static Rectangle getRectangle() throws AWTException {
        int x = getBorderXup(),
                y = getBorderYup(),
                width = getWidth(),
                height = getHeight();
        return new Rectangle(x, y, width, height);
    }
}
