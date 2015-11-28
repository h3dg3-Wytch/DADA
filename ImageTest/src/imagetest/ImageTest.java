package imagetest;

import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.Graphics;

/**
 *
 * @author Maia
 */
public class ImageTest {

    public static void main(String[] args) throws IOException {

        try {
            BufferedImage a = ImageIO.read(new File("src\\Images\\Torso Base (A).png"));
            BufferedImage b = ImageIO.read(new File("src\\Images\\Fighter.png"));
            BufferedImage c = ImageIO.read(new File("src\\Images\\Gnome (m) (A).png"));
            BufferedImage d = new BufferedImage(a.getWidth(), a.getHeight(), BufferedImage.TYPE_INT_ARGB);

            Graphics g = d.getGraphics();

            g.drawImage(a, 0, 0, null);
            g.drawImage(b, 0, 0, null);
            g.drawImage(c, 0, 0, null);
            // retrieve image
            
            File outputfile = new File("saved.png");
            ImageIO.write(d, "png", outputfile);
        } catch (IOException e) {
            //
        }

    }

}
