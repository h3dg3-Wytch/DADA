
package View.Images;

import java.net.URL;

public class ImageLoader
{
     public static URL loadImage(String imageName)
   {
       return ImageLoader.class.getResource(imageName);
   }
}
