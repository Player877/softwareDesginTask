package course1.task5;

public class Client {
    public static void main(String[] args) {
        ImageReaderFactory gifFactory = new GifReaderFactory();
        ImageReader gifReader = gifFactory.createImageReader();
        gifReader.read();

        System.out.println();

        ImageReaderFactory jpgFactory = new JpgReaderFactory();
        ImageReader jpgReader = jpgFactory.createImageReader();
        jpgReader.read();
    }
}
