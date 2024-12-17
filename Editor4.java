import java.awt.Color;


/**
 * Demonstrates the morphing operation into a grayscaled version featured by Runigram.java. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image, and the number of morphing steps (an int). 
 */
public class Editor4 {

    public static void main(String[] args) {
        String fileName = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(fileName);
        Color[][] targetImage = Runigram.grayScaled(sourceImage);
        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage, targetImage, n);
    }
}
