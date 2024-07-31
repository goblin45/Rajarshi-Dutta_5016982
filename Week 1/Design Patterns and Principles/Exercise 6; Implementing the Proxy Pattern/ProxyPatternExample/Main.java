import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

interface Image {
    void display();
    BufferedImage getImage();
}

class RealImage implements Image {
    private String url;
    private BufferedImage image;

    public RealImage(String url) {
        this.url = url;
        loadImage();
    }

    private void loadImage() {
        try {
            URL imageURL = new URL(url);
            image = ImageIO.read(imageURL);
            System.out.println("Image loaded from: " + url);
        } catch (IOException e) {
            System.out.println("Failed to load image: " + e.getMessage());
        }
    }

    public void display() {
        if (image != null) {
            System.out.println("Displaying image loaded from: " + url);
        } else {
            System.out.println("No image to display.");
        }
    }

    public BufferedImage getImage() {
        return image;
    }
}

class ProxyImage implements Image {
    private String url;
    private RealImage realImage;

    public ProxyImage(String url) {
        this.url = url;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(url);
        }
        realImage.display();
    }

    public BufferedImage getImage() {
        if (realImage == null) {
            realImage = new RealImage(url);
        }
        return realImage.getImage();
    }
}

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("https://www.shutterstock.com/shutterstock/photos/1883859943/display_1500/stock-photo-the-word-example-is-written-on-a-magnifying-glass-on-a-yellow-background-1883859943.jpg");
        Image image2 = new ProxyImage("https://media.istockphoto.com/id/1316134499/photo/a-concept-image-of-a-magnifying-glass-on-blue-background-with-a-word-example-zoom-inside-the.jpg?s=612x612&w=0&k=20&c=sZM5HlZvHFYnzjrhaStRpex43URlxg6wwJXff3BE9VA=");

        // Image will be loaded from the remote server and displayed
        image1.display();

        // Image will not be loaded again, instead it will be displayed from cache
        image1.display();

        // Image will be loaded from the remote server and displayed
        image2.display();
    }
}

/*

Output:

Image loaded from: https://www.shutterstock.com/shutterstock/photos/1883859943/display_1500/stock-photo-the-word-example-is-written-on-a-magnifying-glass-on-a-yellow-background-1883859943.jpg
Displaying image loaded from: https://www.shutterstock.com/shutterstock/photos/1883859943/display_1500/stock-photo-the-word-example-is-written-on-a-magnifying-glass-on-a-yellow-background-1883859943.jpg
Displaying image loaded from: https://www.shutterstock.com/shutterstock/photos/1883859943/display_1500/stock-photo-the-word-example-is-written-on-a-magnifying-glass-on-a-yellow-background-1883859943.jpg
Image loaded from: https://media.istockphoto.com/id/1316134499/photo/a-concept-image-of-a-magnifying-glass-on-blue-background-with-a-word-example-zoom-inside-the.jpg?s=612x612&w=0&k=20&c=sZM5HlZvHFYnzjrhaStRpex43URlxg6wwJXff3BE9VA=
Displaying image loaded from: https://media.istockphoto.com/id/1316134499/photo/a-concept-image-of-a-magnifying-glass-on-blue-background-with-a-word-example-zoom-inside-the.jpg?s=612x612&w=0&k=20&c=sZM5HlZvHFYnzjrhaStRpex43URlxg6wwJXff3BE9VA=

*/