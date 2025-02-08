
package read.write.images;
import java.io.*; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;

public class ReadWriteImages {

   
    public static void main(String[] args) throws IOException{
       // For storing image in RAM 
    BufferedImage image = null; 
 
    // READ IMAGE 
    try 
    { 
      File file = new File("C:/Users/msii/Desktop/java/3.png"); 
 
      // Reading input file 
      image = ImageIO.read(file); 
 
      System.out.println("Reading complete."); 
    } 
    catch(IOException e) 
    { 
      System.out.println("Error: "+e); 
    } 
 
    // WRITE IMAGE 
    try 
    { 
      // Output file path 
      File output_file = new File("C:/Users/msii/Desktop/java/outputimage.png"); 
 
      // Writing to file taking type and path as 
      ImageIO.write(image, "png", output_file); 
 
      System.out.println("Writing complete."); 
    } 
    catch(IOException e) 
    { 
      System.out.println("Error: "+e); 
    } 
  
    }
    
}
