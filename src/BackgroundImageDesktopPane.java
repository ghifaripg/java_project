import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class BackgroundImageDesktopPane extends JDesktopPane {
 
    private BufferedImage backgroundImage;

    public BackgroundImageDesktopPane() {
        try {
            backgroundImage = ImageIO.read(new File("src/Image/background.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background image
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
        }
    }
    
}
